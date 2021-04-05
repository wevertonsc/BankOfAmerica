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
import com.bank.of.america.authorizer.repo.HistoryRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HistoryTest {
    @Autowired
    private HistoryRepo historyRepo;

    @Test
    public void verifyHistorySaveData(){
        History history = Fixtures.buildHistory();
        historyRepo.save(history);
        History updateHistory = historyRepo.findHistoryById(history.getId());

        assertEquals(history.getId(),updateHistory.getId());
        assertEquals(history.getBalance(),updateHistory.getBalance());
        assertEquals(history.getValueOperation(),updateHistory.getValueOperation());
        assertEquals(history.getTypeOperation(),updateHistory.getTypeOperation());
        assertEquals(history.getDateOperation(),updateHistory.getDateOperation());
    }
}
