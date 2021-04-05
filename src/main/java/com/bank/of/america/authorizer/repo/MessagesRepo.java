package com.bank.of.america.authorizer.repo;

/*
+- - - - - - - - - - - - - - - - - - - - - -+
| Bank of America Assessment				|
+- - - - - - - - - - - - - - - - - - - - - -+
| Candidate: Weverton de Souza Castanho		|
| Email: wevertonsc@gmail.com				|
| Data: 05.APRIL.2021						|
+- - - - - - - - - - - - - - - - - - - - - -
 */

import com.bank.of.america.authorizer.model.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepo extends JpaRepository<Messages, Long>{
    Messages findMessagesById(Long id);
}
