package com.example.digitalbanking.entities;

import java.util.Date;

import com.example.digitalbanking.enumes.OperationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
public class AccountOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate ;
    private double amount ;
    private OperationType type;
    @ManyToOne
    private BankAccount bankAccount ;
}
