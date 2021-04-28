package com.springcss.account.service;

import com.springcss.account.domain.Account;
import com.springcss.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account getAccountById(Long accountId) {

        return accountRepository.getOne(accountId);
    }

    public Account getAccountByAccountName(String accountName) {

        return accountRepository.findAccountByAccountName(accountName);
    }

    public void addAccount(Account account) {
        accountRepository.save(account);

//        publisher.publishAccountChangedEvent(account, "ADD");
    }

    public void updateAccount(Account account) {
        accountRepository.save(account);

//        publisher.publishAccountChangedEvent(account, "UPDATE");
    }

    public void deleteAccount(Account account) {
        accountRepository.delete(account);
    }
}
