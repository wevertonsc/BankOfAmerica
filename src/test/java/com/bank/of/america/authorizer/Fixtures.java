package com.bank.of.america.authorizer;

/*
+- - - - - - - - - - - - - - - - - - - - - -+
| Bank of America Assessment				|
+- - - - - - - - - - - - - - - - - - - - - -+
| Candidate: Weverton de Souza Castanho		|
| Email: wevertonsc@gmail.com				|
| Data: 05.APRIL.2021						|
+- - - - - - - - - - - - - - - - - - - - - -
 */

import java.util.Date;

public class Fixtures {

    public static com.bank.of.america.authorizer.model.Brand buildBrand(){
        com.bank.of.america.authorizer.model.Brand brand = new com.bank.of.america.authorizer.model.Brand();
        brand.setId(1L);
        brand.setName("visa");

        return brand;
    }

    public static com.bank.of.america.authorizer.model.Card buildCard() {
        com.bank.of.america.authorizer.model.Card card = new com.bank.of.america.authorizer.model.Card();
        card.setId(1L);
        card.setNumber("12345678901234");
        card.setExpiration("10/10");
        card.setCvv("000");
        card.setLimits(1000.00F);
        card.setBalance(1000.00F);

        return card;
    }

    public static com.bank.of.america.authorizer.model.Client buildClient(){
        com.bank.of.america.authorizer.model.Client client = new com.bank.of.america.authorizer.model.Client();
        client.setId(1L);
        client.setName("Fiodor Dostoievski");
        client.setEmail("fiodor.dostoievski@mail.com");

        return client;
    }

    public static com.bank.of.america.authorizer.model.History buildHistory(){
        com.bank.of.america.authorizer.model.History history = new com.bank.of.america.authorizer.model.History();
        history.setId(1L);
        history.setBalance(200.00F);
        history.setDateOperation(new Date(2021, 4, 4));
        history.setTypeOperation("buy");
        history.setValueOperation(100.00F);

        return history;
    }

    public static com.bank.of.america.authorizer.model.Messages buildMessages(){
        com.bank.of.america.authorizer.model.Messages messages = new com.bank.of.america.authorizer.model.Messages();
        messages.setId(1L);
        messages.setMessage("Approved!");
        messages.setDescription("Operation Approved!");

        return messages;
    }

    public static com.bank.of.america.authorizer.dao.Operation buildOperation(){
        com.bank.of.america.authorizer.dao.Operation operation = new com.bank.of.america.authorizer.dao.Operation();
        operation.setBrand("visa");
        operation.setCvv("000");
        operation.setEmail("leon.tolstoi@mail.com");
        operation.setExpiration("12/2024");
        operation.setName("Leon Tolstoi");
        operation.setNumber("4882818360469654");
        operation.setType("buy");
        operation.setValue(100.00F);

        return operation;
    }
}