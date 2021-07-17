package com.bezkoder.spring.jwt.mongodb.converter;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.bezkoder.spring.jwt.mongodb.models.Cart;
import com.bezkoder.spring.jwt.mongodb.payload.request.CartRequest;

@Component
public class CartRequestToCart implements Converter<CartRequest, Cart> {

    @Override
    public Cart convert(CartRequest cartRequest) {
        Cart cart = new Cart();
        if (!StringUtils.isEmpty(cartRequest.getId())) {
            cart.setId(cartRequest.getId());
        }
        cart.setCustomerId(cartRequest.getCustomerId());
        cart.setItems(cartRequest.getItems());
        return cart;
    }
}
