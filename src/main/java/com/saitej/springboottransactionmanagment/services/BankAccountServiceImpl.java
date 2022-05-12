package com.saitej.springboottransactionmanagment.services;

import com.saitej.springboottransactionmanagment.entities.BankAccount;
import com.saitej.springboottransactionmanagment.repos.BankAccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    private final BankAccountRepository bankAccountRepository;

    public BankAccountServiceImpl(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    @Override
    @Transactional// transaction will be rolled back if any exception rises
    public String transfer(int amount) {
        BankAccount billsAccount=bankAccountRepository.findByAccountNumber(12345);
        billsAccount.setBal(billsAccount.getBal()-amount);
        bankAccountRepository.save(billsAccount);

        if (true){
            throw new RuntimeException();
        }

        BankAccount elonAccount=bankAccountRepository.findByAccountNumber(12343);
        elonAccount.setBal((elonAccount.getBal()+amount));
        bankAccountRepository.save(elonAccount);
        return "Amount transferred";
    }
}
