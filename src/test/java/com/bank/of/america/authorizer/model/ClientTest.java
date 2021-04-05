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
import com.bank.of.america.authorizer.repo.ClientRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ClientTest {
    @Autowired
    private ClientRepo clientRepo;

    @Test
    public void verifyClientSaveData(){
        Client client = Fixtures.buildClient();
        clientRepo.save(client);
        Client updateClient = clientRepo.findClientById(client.getId());

        assertEquals(client.getId(),updateClient.getId());
        assertEquals(client.getName(),updateClient.getName());
        assertEquals(client.getEmail(),updateClient.getEmail());
    }
}
