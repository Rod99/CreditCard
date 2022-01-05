package com.ibm.academia.creditcard.controllers;

import com.ibm.academia.creditcard.entities.CreditCard;
import com.ibm.academia.creditcard.enums.Passion;
import com.ibm.academia.creditcard.exceptions.NotFoundException;
import com.ibm.academia.creditcard.services.CreditCardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/credit-card")
public class CreditCardController {

    @Autowired
    private CreditCardDAO creditCardDAO;

    /**
     * Endpoint used to get possible credit card options for users
     * @param passion Parameter used to filter the options,
     * @param age Parameter used to filter the options
     * @param salary Parameter used to filter the options
     * @return A list of credit card options
     */
    @GetMapping("/search-options-credit-card")
    public ResponseEntity<?> getCreditCardOptionsByRequirements(@RequestParam Passion passion,
                                                             @RequestParam Integer age,
                                                             @RequestParam Integer salary) {

        CreditCard creditCard = creditCardDAO.findCreditCardByRequirements(passion, age, salary);
        if (creditCard != null) {
            return new ResponseEntity<>(creditCard, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No credit card found", HttpStatus.NOT_FOUND);
        }

    }

    /**
     * Endpoint used to get a credit card by id
     * @param creditCard Parameter that contains all data of the credit card
     * @return The credit card created and a status code
     */
    @PostMapping("/create-credit-card")
    public ResponseEntity<?> createCreditCard(@Valid @RequestBody CreditCard creditCard) {

        CreditCard creditCardCreated = creditCardDAO.save(creditCard);

        if (creditCardCreated != null) {
            return new ResponseEntity<>(creditCardCreated, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Credit card not created", HttpStatus.NOT_MODIFIED);
        }
    }

    /**
     * Endpoint used to get all credit cards
     * @return A list of credit cards in the database
     */
    @GetMapping
    public ResponseEntity<?> getAllCreditCards() {
        try {
            return new ResponseEntity<>(creditCardDAO.getAll(), HttpStatus.OK);
        } catch (NotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
