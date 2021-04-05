package com.bank.of.america.authorizer.controller;

/*
+- - - - - - - - - - - - - - - - - - - - - -+
| Bank of America Assessment				|
+- - - - - - - - - - - - - - - - - - - - - -+
| Candidate: Weverton de Souza Castanho		|
| Email: wevertonsc@gmail.com				|
| Data: 05.APRIL.2021						|
+- - - - - - - - - - - - - - - - - - - - - -
 */

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class OperationControllerIT {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void executeTestPost() throws Exception {

        mockMvc.perform(post("/api/v1/operation")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "  \"brand\": \"visa\",\n" +
                        "  \"cvv\": \"000\",\n" +
                        "  \"email\": \"leon.tolstoi@mail.com\",\n" +
                        "  \"expiration\": \"12/2024\",\n" +
                        "  \"name\": \"Leon Tolstoi\",\n" +
                        "  \"number\": \"4882818360469654\",\n" +
                        "  \"type\": \"buy\",\n" +
                        "  \"value\": 100.00\n" +
                        "}"))
                .andDo(print()).andExpect(status().isOk());
    }
}
