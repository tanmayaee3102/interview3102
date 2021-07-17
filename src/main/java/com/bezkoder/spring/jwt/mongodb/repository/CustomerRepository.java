package com.bezkoder.spring.jwt.mongodb.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.jwt.mongodb.models.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> findAll();

    Customer findCustomerById(String id);
    
    Customer findCustomerByName(String name);

    Customer findCustomerByEmail(String email);
}
