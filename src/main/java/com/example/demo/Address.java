package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String street_number;
    public String street_name;
    public String city;
    public String state;
    public String zip;

    public Address(){
    }

//    public Address(Long id, String street_number, String street_name, String city, String state, String zip) {
//        this.id = id;
//        this.street_number = street_number;
//        this.street_name = street_name;
//        this.city = city;
//        this.state = state;
//        this.zip = zip;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street_number='" + street_number + '\'' +
                ", street_name='" + street_name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
