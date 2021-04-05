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

import com.bank.of.america.authorizer.dao.Operation;
import com.bank.of.america.authorizer.model.Messages;
import com.bank.of.america.authorizer.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/operation")
public class OperationController {
    @Autowired
    private OperationService operationService;

    @RequestMapping(method = RequestMethod.POST)
    public Messages execute(@RequestBody Operation operation){
         return operationService.executeOperation(operation);
    }
}
