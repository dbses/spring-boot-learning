package com.springcss.account.controller;

import com.springcss.account.domain.Account;
import com.springcss.account.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "accounts", produces = "application/json")
public class AccountController {

    @Autowired
    private AccountService accountService;

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @GetMapping(value = "/{accountId}")
    public Account getAccountById(@PathVariable("accountId") Long accountId) {

        logger.info("Get account by id: {} ", accountId);

        Account account = new Account();
        account.setId(1L);
        account.setAccountCode("DemoCode");
        account.setAccountName("DemoName");

        return account;
    }

    @GetMapping(value = "accountname/{accountName}")
    public Account getAccountByAccountName(@PathVariable("accountName") String accountName) {

        return accountService.getAccountByAccountName(accountName);
    }

    @PostMapping(value = "/")
    public void addAccount(@RequestBody Account account) {

        accountService.addAccount(account);
    }

    @PutMapping(value = "/")
    public void updateAccount(@RequestBody Account account) {

        accountService.updateAccount(account);
    }

    @DeleteMapping(value = "/")
    public void deleteAccount(@RequestBody Account account) {

        accountService.deleteAccount(account);
    }
}
