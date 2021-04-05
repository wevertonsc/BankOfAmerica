package com.bank.of.america.authorizer.model;

/*
+- - - - - - - - - - - - - - - - - - - - - -+
| Bank of America Assessment				|
+- - - - - - - - - - - - - - - - - - - - - -+
| Candidate: Weverton de Souza Castanho		|
| Email: wevertonsc@gmail.com				|
| Data: 05.APRIL.2021						|
+- - - - - - - - - - - - - - - - - - - - - -
 */

import com.bank.of.america.authorizer.Fixtures;
import com.bank.of.america.authorizer.repo.CardRepo;
import javassist.NotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CardTest {
    @Autowired
    private CardRepo cardRepo;

    @Test
    public void verifyCardSaveData() throws NotFoundException {
        Card card = Fixtures.buildCard();
        cardRepo.save(card);
        Card updateCard = cardRepo.findCardByNumber(Fixtures.buildCard().getNumber()).orElseThrow(
                () -> {return new NotFoundException("number was not founded!");});

        assertEquals(card.getId(), updateCard.getId());
        assertEquals(card.getNumber(), updateCard.getNumber());
        assertEquals(card.getExpiration(), updateCard.getExpiration());
        assertEquals(card.getCvv(), updateCard.getCvv());
        assertEquals(card.getLimits(), updateCard.getLimits());
        assertEquals(card.getBalance(), updateCard.getBalance());
    }
}