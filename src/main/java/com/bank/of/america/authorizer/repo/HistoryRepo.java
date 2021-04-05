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

import com.bank.of.america.authorizer.model.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepo extends JpaRepository<History, Long> {
    History findHistoryById(Long id);
}
