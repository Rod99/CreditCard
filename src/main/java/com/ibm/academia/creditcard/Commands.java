package com.ibm.academia.creditcard;

import com.ibm.academia.creditcard.entities.CreditCard;
import com.ibm.academia.creditcard.enums.Passion;
import com.ibm.academia.creditcard.services.CreditCardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Commands implements CommandLineRunner {

    @Autowired
    private CreditCardDAO creditCardDAO;

    @Override
    public void run(String... args) throws Exception {
        creditCardDAO.save(new CreditCard(7000, 14999, 18, 23, Passion.SHOPPING, "BSmart, Affinity Card"));
        creditCardDAO.save(new CreditCard(7000, 14999, 24, 32, Passion.SHOPPING, "BSmart, Clasica, Affinity Card, Office Depot, Costco, Best Buy Banamex, The Home Depot"));
        creditCardDAO.save(new CreditCard(7000, 14999, 33, 75, Passion.SHOPPING, "Clasica, Office Depot, Costco, Best Buy Banamex, The Home Depot"));
        creditCardDAO.save(new CreditCard(15000, 34999, 18, 23, Passion.SHOPPING, "BSmart, Affinity Card"));
        creditCardDAO.save(new CreditCard(15000, 34999, 24, 32, Passion.SHOPPING, "Oro, Affinity Card, Office Depot, Costco, Best Buy Banamex, The Home Depot"));
        creditCardDAO.save(new CreditCard(15000, 34999, 33, 75, Passion.SHOPPING, "Oro, Office Depot, Costco, Best Buy Banamex, The Home Depot"));
        creditCardDAO.save(new CreditCard(35000, 49999, 18, 23, Passion.SHOPPING, "BSmart, Affinity Card"));
        creditCardDAO.save(new CreditCard(35000, 49999, 24, 75, Passion.SHOPPING, "Platinum, Office Depot, Costco, Best Buy Banamex, The Home Depot"));
        creditCardDAO.save(new CreditCard(50000, 100000, 18, 23, Passion.SHOPPING, "BSmart, Affinity Card"));
        creditCardDAO.save(new CreditCard(50000, 100000, 24, 75, Passion.SHOPPING, "Platinum"));
        creditCardDAO.save(new CreditCard(12000, 29999, 18, 75, Passion.TRAVELS, "City / AAdvantage"));
        creditCardDAO.save(new CreditCard(30000, 34999, 18, 23, Passion.TRAVELS, "City / AAdvantage"));
        creditCardDAO.save(new CreditCard(30000, 34999, 24, 75, Passion.TRAVELS, "City / AAdvantage"));
        creditCardDAO.save(new CreditCard(35000, 49999, 18, 23, Passion.TRAVELS, "City / AAdvantage"));
        creditCardDAO.save(new CreditCard(35000, 49999, 24, 75, Passion.TRAVELS, "City / AAdvantage, Platinum"));
        creditCardDAO.save(new CreditCard(50000, 100000, 18, 22, Passion.TRAVELS, "City / AAdvantage"));
        creditCardDAO.save(new CreditCard(50000, 100000, 23, 75, Passion.TRAVELS, "Platinum"));
        creditCardDAO.save(new CreditCard(12000, 100000, 18, 75, Passion.HELP, "Banamex, Teleton, APAC"));
        creditCardDAO.save(new CreditCard(7000, 100000, 18, 75, Passion.BUSINESS, "Office Depot, Costco, Best Buy Banamex, The Home Depot"));
        creditCardDAO.save(new CreditCard(7000, 34999, 18, 75, Passion.SPORTS, "Marti Clasica, Citibanamex, America Deporteismo, Pumas Deporteismo, Toluca Deporteismo, La Verde Deporteismo"));
        creditCardDAO.save(new CreditCard(35000, 100000, 18, 75, Passion.SPORTS, "Marti Premium Citibanamex"));
        creditCardDAO.save(new CreditCard(7000, 14999, 18, 32, Passion.STYLE, "BSmart, Afinity Card"));
        creditCardDAO.save(new CreditCard(7000, 14999, 33, 75, Passion.STYLE, "BSmart"));
        creditCardDAO.save(new CreditCard(15000, 29999, 18, 23, Passion.STYLE, "BSmart, Afinity Card"));
        creditCardDAO.save(new CreditCard(15000, 29999, 24, 32, Passion.STYLE, "BSmart, Oro, Afinity Card"));
        creditCardDAO.save(new CreditCard(15000, 29999, 33, 75, Passion.STYLE, "Oro"));
        creditCardDAO.save(new CreditCard(30000, 34999, 18, 23, Passion.STYLE, "BSmart, Afinity Card"));
        creditCardDAO.save(new CreditCard(30000, 34999, 24, 32, Passion.STYLE, "BSmart, Platinum, Afinity Card"));
        creditCardDAO.save(new CreditCard(30000, 34999, 33, 75, Passion.STYLE, "Platinum"));
        creditCardDAO.save(new CreditCard(35000, 100000, 18, 23, Passion.STYLE, "BSmart"));
        creditCardDAO.save(new CreditCard(35000, 100000, 24, 75, Passion.STYLE, "BSmart, Platinum"));
    }
}
