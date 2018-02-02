package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/accounts")
    public List<Account> getAllTopics(){
        return accountService.getAllAccounts();
    }

    @RequestMapping("/accounts/{customer_Id}")
    public Account getAccount(@PathVariable Long customer_Id){
        return accountService.getAccount(customer_Id);
    }

    @RequestMapping("customers/{customer_Id}/accounts")
    public Account getCustomerAccountsById(@PathVariable Long customer_Id){
       return accountService.getCustomerAccountsById(customer_Id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customers/{customer_Id}/accounts")
    public void addAccount(@RequestBody Account account, @PathVariable Long customer_Id){
        accountService.addAccount(customer_Id, account);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/accounts/{id}")
    public void updateAccount(@RequestBody Account account, @PathVariable Long id){
        accountService.updateAccount(id,account);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/accounts/{id}")
    public void deleteAccount(@PathVariable Long id){
        accountService.deleteAccount(id);
    }


}
