package com.ibm.academia.creditcard.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.academia.creditcard.enums.Passion;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "credit_cards")
public class CreditCard implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty("low_salary")
    @Positive(message = "The salary must be greater than 0")
    @Column(name = "low_salary", nullable = false)
    private Integer lowSalary;

    @JsonProperty("up_salary")
    @Positive(message = "The salary must be greater than 0")
    @Max(value = 10000, message = "The salary must be less than 10000 dollars")
    @Column(name = "up_salary", nullable = false)
    private Integer upSalary;

    @JsonProperty("minimum_age")
    @Min(value = 18, message = "The age must be greater or equal to 18")
    @Column(name = "minimum_age", nullable = false)
    private Integer minimumAge;

    @JsonProperty("maximum_age")
    @Max(value = 75, message = "The age must be less or equal to 75")
    @Column(name = "maximum_age", nullable = false)
    private Integer maximumAge;

    @JsonProperty("option_credit_card")
    @NotEmpty(message = "The option of credit card must not be empty")
    @Column(name = "option_credit_card", nullable = false)
    private String optionCreditCard;

    @JsonProperty("passion")
    @Enumerated(EnumType.STRING)
    @Column(name = "passion", nullable = false)
    private Passion passion;

    public CreditCard(Integer lowSalary, Integer upSalary, Integer minimumAge, Integer maximumAge, Passion passion, String optionCreditCard) {
        this.lowSalary = lowSalary;
        this.upSalary = upSalary;
        this.minimumAge = minimumAge;
        this.maximumAge = maximumAge;
        this.passion = passion;
        this.optionCreditCard = optionCreditCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CreditCard that = (CreditCard) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    private static final long serialVersionUID = 8620454221290490200L;
}
