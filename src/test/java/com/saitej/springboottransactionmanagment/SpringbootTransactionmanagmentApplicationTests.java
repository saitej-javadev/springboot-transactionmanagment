package com.saitej.springboottransactionmanagment;

import com.saitej.springboottransactionmanagment.services.BankAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTransactionmanagmentApplicationTests {

    @Autowired
    private BankAccountService bankAccountService;


    @Test
    void testTransfer() {
        bankAccountService.transfer(500);
    }
}
