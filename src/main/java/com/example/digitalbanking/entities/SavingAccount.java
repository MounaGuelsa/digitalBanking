package com.example.digitalbanking.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
// ce discriminateuer est ajoute car on choisi single tbale et o ajoute un chapms qui s 'appele type pr defiferencie si un saving account ou cuurent account
@DiscriminatorValue("SA")
public class SavingAccount extends BankAccount {
    private double interstRate;
}
