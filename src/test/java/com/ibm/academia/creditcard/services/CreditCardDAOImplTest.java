package com.ibm.academia.creditcard.services;

import com.ibm.academia.creditcard.cards.CardsDummy;
import com.ibm.academia.creditcard.entities.CreditCard;
import com.ibm.academia.creditcard.enums.Passion;
import com.ibm.academia.creditcard.repositories.CreditCardRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class CreditCardDAOImplTest {

    CreditCardDAO creditCardDAO;
    CreditCardRepository creditCardRepository;

    @BeforeEach
    public void setUp() {
        creditCardRepository = mock(CreditCardRepository.class);
        creditCardDAO = new CreditCardDAOImpl(creditCardRepository);
    }


    /**
     * Test method for {@link CreditCardDAOImpl#findCreditCardByRequirements(Passion, Integer, Integer)}.
     */
    @Test
    void findOptionsByRequirements(){
        when(creditCardRepository.findCreditCardByRequirements(
                String.valueOf(Passion.SHOPPING),
                20,
                7500)).thenReturn(CardsDummy.firstCard());

        CreditCard creditCard = creditCardDAO.findCreditCardByRequirements(Passion.SHOPPING, 20, 7500);

        assertThat(creditCard.getOptionCreditCard()).isEqualTo(CardsDummy.firstCard().getOptionCreditCard());
        verify(creditCardRepository).findCreditCardByRequirements(String.valueOf(Passion.SHOPPING), 20, 7500);

    }

}
