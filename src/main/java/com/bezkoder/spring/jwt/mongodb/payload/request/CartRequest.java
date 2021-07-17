package com.bezkoder.spring.jwt.mongodb.payload.request;


import java.util.List;

import com.bezkoder.spring.jwt.mongodb.models.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartRequest extends BaseRequest {

    private String customerId;
    private List<Item> items;
}
