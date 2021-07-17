package com.bezkoder.spring.jwt.mongodb.security.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.jwt.mongodb.converter.CartRequestToCart;
import com.bezkoder.spring.jwt.mongodb.models.Cart;
import com.bezkoder.spring.jwt.mongodb.payload.request.CartRequest;
import com.bezkoder.spring.jwt.mongodb.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

    private CartRepository cartRepository;
    private CartRequestToCart cartRequestToCart;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository, CartRequestToCart cartRequestToCart) {
        this.cartRepository = cartRepository;
        this.cartRequestToCart = cartRequestToCart;
    }

    @Override
    public synchronized Cart saveOrUpdate(CartRequest cartRequest) {
        return cartRepository.save(cartRequestToCart.convert(cartRequest));
    }

    @Override
    public synchronized Cart findCartByCustomerId(CartRequest cartRequest) {
        return cartRepository.findCartByCustomerId(cartRequest.getCustomerId());
    }

    @Override
    public List<Cart> findAllCarts() {
        return cartRepository.findAll();
    }
}
