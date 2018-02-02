package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping("/accounts/{customer_Id}/customer")
    public Customer getCustomerByAccount(@PathVariable Long customer_Id){
        return customerService.getCustomerByAccount(customer_Id);
    }

    @RequestMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customer")
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/customer/{customer_Id}")
    public void updateCustomer(@RequestBody Customer customer, @PathVariable Long customer_Id){
        customerService.updateCustomer(customer_Id,customer);
    }

//    @RequestMapping(method = RequestMethod.DELETE, value = "/customer/{id}")
//    public void deleteCustomer(@PathVariable Long id){
//        customerService.deleteCustomer(id);
//    }





}
