package com.ibm.academia.creditcard.repositories;

import com.ibm.academia.creditcard.entities.CreditCard;
import com.ibm.academia.creditcard.enums.Passion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardRepositoryTest {

    private CreditCardRepository creditCardRepository = Mockito.mock(CreditCardRepository.class);

    @BeforeEach
    void setUp() {
        Mockito.when(creditCardRepository.findCreditCardByRequirements(Passion.SHOPPING.name(), 20, 7500)).
                thenReturn(new CreditCard(7000, 14999, 18, 23, Passion.SHOPPING, "BSmart, Affinity Card"));
    }

    @Test
    void findCreditCardByRequirements() {
        CreditCard expectedCard = new CreditCard(7000, 14999, 18, 23, Passion.SHOPPING, "BSmart, Affinity Card");
        assertEquals(expectedCard, creditCardRepository.findCreditCardByRequirements(Passion.SHOPPING.name(), 20, 7500));
    }
}