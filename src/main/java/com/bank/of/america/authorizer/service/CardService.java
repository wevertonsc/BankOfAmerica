package com.bank.of.america.authorizer.service;

/*
+- - - - - - - - - - - - - - - - - - - - - -+
| Bank of America Assessment				|
+- - - - - - - - - - - - - - - - - - - - - -+
| Candidate: Weverton de Souza Castanho		|
| Email: wevertonsc@gmail.com				|
| Data: 05.APRIL.2021						|
+- - - - - - - - - - - - - - - - - - - - - -
 */

import javassist.NotFoundException;
import com.bank.of.america.authorizer.model.Card;
import com.bank.of.america.authorizer.repo.CardRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class CardService {
    private final CardRepo cardRepo;

    public List<Card> getCards() {
        log.info("getCards");
        return cardRepo.findAll();
    }

    public Card getCard(String number) throws NotFoundException {
        return cardRepo.findCardByNumber(number);

    }
}
