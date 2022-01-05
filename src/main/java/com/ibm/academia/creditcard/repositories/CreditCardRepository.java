package com.ibm.academia.creditcard.repositories;

import com.ibm.academia.creditcard.entities.CreditCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("creditCardsRepository")
public interface CreditCardRepository extends CrudRepository<CreditCard, Long> {
    @Query(value = "SELECT * FROM credit_cards c WHERE c.passion LIKE ?1 " +
            "AND (?2 BETWEEN c.minimum_age AND c.maximum_age) " +
            "AND (?3 BETWEEN c.low_salary AND c.up_salary)", nativeQuery = true)
    CreditCard findCreditCardByRequirements(String passion, Integer age, Integer salary);
}
