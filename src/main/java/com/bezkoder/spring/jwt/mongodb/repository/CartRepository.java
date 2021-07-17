package com.bezkoder.spring.jwt.mongodb.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.jwt.mongodb.models.Cart;

@Repository
public interface CartRepository extends MongoRepository<Cart, String> {
    Cart findCartByCustomerId(String customerId);
}
