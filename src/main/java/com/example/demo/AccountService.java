package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        List<Account> topics = new ArrayList<>();
        accountRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Account getAccount(Long customer_Id) {
        return accountRepository.findOne(customer_Id);
    }

    public Account getCustomerAccountsById(Long customer_Id){
        return accountRepository.findOne(customer_Id);
    }

    public void addAccount(Long customer_Id, Account account) {
        accountRepository.save(account);
    }

    public void updateAccount(Long id, Account account) {
        accountRepository.save(account);
    }

    public void deleteAccount(Long id) {
        accountRepository.delete(id);
    }


}
