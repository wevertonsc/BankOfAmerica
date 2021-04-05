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
import com.bank.of.america.authorizer.repo.BrandRepo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BrandTest {
    @Autowired
    private BrandRepo brandRepo;

    @Test
    public void verifyBrandSaveData(){
        Brand brand = Fixtures.buildBrand();
        brandRepo.save(brand);
        Brand updateBrand = brandRepo.findBrandById(brand.getId());

        assertEquals(brand.getId(),updateBrand.getId());
        assertEquals(brand.getName(), updateBrand.getName());
    }
}
