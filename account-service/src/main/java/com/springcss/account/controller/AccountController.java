package com.springcss.account.controller;

import com.springcss.account.domain.Account;
import com.springcss.account.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

@RestController
@RequestMapping(value = "accounts", produces = "application/json")
public class AccountController {

    @Autowired
    private AccountService accountService;

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @GetMapping(value = "/{accountId}")
    public Account getAccountById(@PathVariable("accountId") Long accountId) {

        logger.info("Get account by id: {} ", accountId);

        return accountService.getAccountById(accountId);
    }

    @PostMapping
    public void addAccount(@RequestBody Account account) {

        accountService.addAccount(account);
    }

    @PutMapping
    public void updateAccount(@RequestBody Account account) {

        accountService.updateAccount(account);
    }

    @DeleteMapping
    public void deleteAccount(@RequestBody Account account) {

        accountService.deleteAccount(account);
    }
}
