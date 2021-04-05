package com.bank.of.america.authorizer.service;

import com.bank.of.america.authorizer.dao.Operation;
import com.bank.of.america.authorizer.model.Card;
import com.bank.of.america.authorizer.model.History;
import com.bank.of.america.authorizer.model.Messages;
import com.bank.of.america.authorizer.repo.CardRepo;
import com.bank.of.america.authorizer.repo.HistoryRepo;
import com.bank.of.america.authorizer.repo.MessagesRepo;
import com.bank.of.america.authorizer.util.JavaLuhnAlgorithm;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

/*
+- - - - - - - - - - - - - - - - - - - - - -+
| Bank of America Assessment				|
+- - - - - - - - - - - - - - - - - - - - - -+
| Candidate: Weverton de Souza Castanho		|
| Email: wevertonsc@gmail.com				|
| Data: 05.APRIL.2021						|
+- - - - - - - - - - - - - - - - - - - - - -
 */

@Service
@Slf4j
@AllArgsConstructor
public class OperationService {
    private final CardRepo cardRepo;
    private final MessagesRepo messagesRepo;
    private final HistoryRepo historyRepo;

    public Messages executeOperation(Operation operation){

        // - - Card number validation - -
        JavaLuhnAlgorithm javaLuhnAlgorithm = new JavaLuhnAlgorithm();
        if(!javaLuhnAlgorithm.validateCreditCardNumber(operation.getNumber())) {
            log.error("invalid card number!");
            return messagesRepo.findMessagesById(1L);
        }

        // - - Verify if card exists - -
        Card card = cardRepo.findCardByNumber(operation.getNumber())
                .orElseThrow(
                        () -> {
                            log.error("card number not founded!");
                            return null;
                        });

        // - - Return message - -
        if(card == null){
            return messagesRepo.findMessagesById(1L);
        }

        // - - Verify email - -
        if(!card.getClient().getName().equals(operation.getName())){
            log.error("name is invalid!");
            return messagesRepo.findMessagesById(2L);
        }

        // - - Verify email - -
        if(!card.getClient().getEmail().equals(operation.getEmail())){
            log.error("email is invalid!");
            return messagesRepo.findMessagesById(2L);
        }

        // - - Verify data expiration - -
        if(!card.getExpiration().equals(operation.getExpiration())){
            log.error("card number not founded!");
            return messagesRepo.findMessagesById(3L);
        }

        // - - Verify CVV - -
        if(!card.getCvv().equals(operation.getCvv())){
            log.error("cvv number is invalid!");
            return messagesRepo.findMessagesById(4L);
        }

        // - - Verify card balance - -
        if(card.getBalance() < operation.getValue()){
            log.error("value exceeds the card balance!");
            return messagesRepo.findMessagesById(5L);
        }

        // - - Finalize operation - -
        History history = new History();
        card.setBalance(card.getBalance() - operation.getValue());
        cardRepo.save(card);
        history.setCard(card);
        history.setDateOperation(new Date());
        history.setBalance(card.getBalance());
        history.setValueOperation(operation.getValue());
        history.setTypeOperation(operation.getType());
        history.setMessages(messagesRepo.findMessagesById(6L));
        historyRepo.save(history);

        return messagesRepo.findMessagesById(6L);
    }

}

