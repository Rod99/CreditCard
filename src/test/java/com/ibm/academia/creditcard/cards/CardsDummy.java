package com.ibm.academia.creditcard.cards;

import com.ibm.academia.creditcard.entities.CreditCard;
import com.ibm.academia.creditcard.enums.Passion;

public class CardsDummy {

    public static CreditCard firstCard() {
        return new CreditCard(7000, 14999, 18, 23, Passion.SHOPPING, "BSmart, Affinity Card");
    }

    public static CreditCard secondCard() {
        return new CreditCard(7000, 14999, 24, 32, Passion.SHOPPING, "BSmart, Clasica, Affinity Card, Office Depot, Costco, Best Buy Banamex, The Home Depot");
    }

    public static CreditCard thirdCard() {
        return new CreditCard(7000, 14999, 33, 75, Passion.SHOPPING, "Clasica, Office Depot, Costco, Best Buy Banamex, The Home Depot");
    }

    public static CreditCard fourthCard() {
        return new CreditCard(15000, 34999, 18, 23, Passion.SHOPPING, "BSmart, Affinity Card");
    }

    public static CreditCard fifthCard() {
        return new CreditCard(15000, 34999, 24, 32, Passion.SHOPPING, "Oro, Affinity Card, Office Depot, Costco, Best Buy Banamex, The Home Depot");
    }

    public static CreditCard sixthCard() {
        return new CreditCard(15000, 34999, 33, 75, Passion.SHOPPING, "Oro, Office Depot, Costco, Best Buy Banamex, The Home Depot");
    }

    public static CreditCard seventhCard() {
        return new CreditCard(35000, 49999, 18, 23, Passion.SHOPPING, "BSmart, Affinity Card");
    }

    public static CreditCard eighthCard() {
        return new CreditCard(35000, 49999, 24, 75, Passion.SHOPPING, "Platinum, Office Depot, Costco, Best Buy Banamex, The Home Depot");
    }

    public static CreditCard ninthCard() {
        return new CreditCard(50000, 100000, 18, 23, Passion.SHOPPING, "BSmart, Affinity Card");
    }

    public static CreditCard tenthCard() {
        return new CreditCard(50000, 100000, 24, 75, Passion.SHOPPING, "Platinum");
    }

    public static CreditCard eleventhCard() {
        return new CreditCard(12000, 29999, 18, 75, Passion.TRAVELS, "City / AAdvantage");
    }

    public static CreditCard twelfthCard() {
        return new CreditCard(30000, 34999, 18, 23, Passion.TRAVELS, "City / AAdvantage");
    }

    public static CreditCard thirteenthCard() {
        return new CreditCard(30000, 34999, 24, 75, Passion.TRAVELS, "City / AAdvantage");
    }

    public static CreditCard fourteenthCard() {
        return new CreditCard(35000, 49999, 18, 23, Passion.TRAVELS, "City / AAdvantage");
    }

    public static CreditCard fifteenthCard() {
        return new CreditCard(35000, 49999, 24, 75, Passion.TRAVELS, "City / AAdvantage, Platinum");
    }

    public static CreditCard sixteenthCard() {
        return new CreditCard(50000, 100000, 18, 22, Passion.TRAVELS, "City / AAdvantage");
    }

    public static CreditCard seventeenthCard() {
        return new CreditCard(50000, 100000, 23, 75, Passion.TRAVELS, "Platinum");
    }

    public static CreditCard eighteenthCard() {
        return new CreditCard(12000, 100000, 18, 75, Passion.HELP, "Banamex, Teleton, APAC");
    }

    public static CreditCard nineteenthCard() {
        return new CreditCard(7000, 100000, 18, 75, Passion.BUSINESS, "Office Depot, Costco, Best Buy Banamex, The Home Depot");
    }

    public static CreditCard twentiethCard() {
        return new CreditCard(7000, 34999, 18, 75, Passion.SPORTS, "Marti Clasica, Citibanamex, America Deporteismo, Pumas Deporteismo, Toluca Deporteismo, La Verde Deporteismo");
    }

    public static CreditCard twentyfirstCard() {
        return new CreditCard(35000, 100000, 18, 75, Passion.SPORTS, "Marti Premium Citibanamex");
    }

    public static CreditCard twentysecondCard() {
        return new CreditCard(7000, 14999, 18, 32, Passion.STYLE, "BSmart, Afinity Card");
    }

    public static CreditCard twentythirdCard() {
        return new CreditCard(7000, 14999, 33, 75, Passion.STYLE, "BSmart");
    }

    public static CreditCard twentyfourthCard() {
        return new CreditCard(15000, 29999, 18, 23, Passion.STYLE, "BSmart, Afinity Card");
    }

    public static CreditCard twentyfifthCard() {
        return new CreditCard(15000, 29999, 24, 32, Passion.STYLE, "BSmart, Oro, Afinity Card");
    }

    public static CreditCard twentysixthCard() {
        return new CreditCard(15000, 29999, 33, 75, Passion.STYLE, "Oro");
    }

    public static CreditCard twentyseventhCard() {
        return new CreditCard(30000, 34999, 18, 23, Passion.STYLE, "BSmart, Afinity Card");
    }

    public static CreditCard twentyeighthCard() {
        return new CreditCard(30000, 34999, 24, 32, Passion.STYLE, "BSmart, Platinum, Afinity Card");
    }

    public static CreditCard twentyninthCard() {
        return new CreditCard(30000, 34999, 33, 75, Passion.STYLE, "Platinum");
    }

    public static CreditCard thirtiethCard() {
        return new CreditCard(35000, 100000, 18, 23, Passion.STYLE, "BSmart");
    }

    public static CreditCard thirtyfirstCard() {
        return new CreditCard(35000, 100000, 24, 75, Passion.STYLE, "BSmart, Platinum");
    }

}
