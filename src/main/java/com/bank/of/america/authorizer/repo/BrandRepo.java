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

import com.bank.of.america.authorizer.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepo extends JpaRepository<Brand, Long> {
    Brand findBrandById(Long id);
}
