package com.saitej.springboottransactionmanagment.entities;


import lombok.*;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "bankaccount")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "accno")
    private int accountNumber;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    private int bal;


    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bal=" + bal +
                '}';
    }
}
