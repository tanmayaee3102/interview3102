package com.bezkoder.spring.jwt.mongodb.security.services;

import java.util.List;

import com.bezkoder.spring.jwt.mongodb.models.Cart;
import com.bezkoder.spring.jwt.mongodb.payload.request.CartRequest;

public interface CartService {
    Cart saveOrUpdate(CartRequest cartRequest);

    Cart findCartByCustomerId(CartRequest cartRequest);

    List<Cart> findAllCarts();
}
