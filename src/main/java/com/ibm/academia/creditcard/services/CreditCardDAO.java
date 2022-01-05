package com.ibm.academia.creditcard.services;

import com.ibm.academia.creditcard.entities.CreditCard;
import com.ibm.academia.creditcard.enums.Passion;

public interface CreditCardDAO extends GenericDAO<CreditCard> {
    CreditCard findCreditCardByRequirements(Passion passion, Integer age, Integer salary);
}
