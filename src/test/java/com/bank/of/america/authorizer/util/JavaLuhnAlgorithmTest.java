package com.bank.of.america.authorizer.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class JavaLuhnAlgorithmTest {
    @Test
    public void validateCreditCardNumberValidCard(){
        JavaLuhnAlgorithm javaLuhnAlgorithm = new JavaLuhnAlgorithm();
        assertTrue(javaLuhnAlgorithm.validateCreditCardNumber("12345678903555"));
    }

    @Test
    public void validateCreditCardNumberInvalidCard(){
        JavaLuhnAlgorithm javaLuhnAlgorithm = new JavaLuhnAlgorithm();
        assertFalse(javaLuhnAlgorithm.validateCreditCardNumber("01285000358020"));
    }
}
