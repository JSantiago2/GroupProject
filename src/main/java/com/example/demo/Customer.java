package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@JsonProperty("customer_id")
    public Long customer_Id;
    //@JsonProperty("first_name")
    public String first_Name;
    //@JsonProperty("last_name")
    public String last_Name;
    @OneToMany(cascade = CascadeType.ALL)
    public Set<Address> address;

    public Customer(){
    }

//    public Customer(Long customerId, String first_name, String last_name, Set<Address> address) {
//        this.customerId = customerId;
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_Id=" + customer_Id +
                ", first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", address=" + address +
                '}';
    }
}
