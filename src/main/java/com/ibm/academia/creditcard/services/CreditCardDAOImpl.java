package com.ibm.academia.creditcard.services;

import com.ibm.academia.creditcard.entities.CreditCard;
import com.ibm.academia.creditcard.enums.Passion;
import com.ibm.academia.creditcard.repositories.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CreditCardDAOImpl extends GenericDAOImpl<CreditCard, CreditCardRepository> implements CreditCardDAO {

    @Autowired
    public CreditCardDAOImpl(CreditCardRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public CreditCard findCreditCardByRequirements(Passion passion, Integer age, Integer salary) {
        return repository.findCreditCardByRequirements(passion.name(), age, salary);
    }
}
