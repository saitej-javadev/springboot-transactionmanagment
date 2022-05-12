package com.saitej.springboottransactionmanagment.repos;

import com.saitej.springboottransactionmanagment.entities.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends CrudRepository<BankAccount,Long> {
    BankAccount findByAccountNumber(int i);
}
