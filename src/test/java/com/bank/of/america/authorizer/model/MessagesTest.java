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
import com.bank.of.america.authorizer.repo.MessagesRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MessagesTest {
    @Autowired
    private MessagesRepo messagesRepo;

    @Test
    public void verifyHistorySaveData(){
        Messages messages = Fixtures.buildMessages();
        messagesRepo.save(messages);
        Messages updateMessages = messagesRepo.findMessagesById(messages.getId());

        assertEquals(messages.getId(),updateMessages.getId());
        assertEquals(messages.getMessage(),updateMessages.getMessage());
        assertEquals(messages.getDescription(),updateMessages.getDescription());
    }
}
