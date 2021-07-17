package com.bezkoder.spring.jwt.mongodb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "items")
public class Item {

	@Id
    private String id;
	
    private @NonNull String name;
    private @NonNull Double price;
    private @NonNull Double sellingprice;
    private @NonNull Integer quantity;
    private @NonNull String color;
    private @NonNull String image;
    private @NonNull Integer kg;
    private @NonNull String createdby;
    private @NonNull String createddate;
    private @NonNull String updatedby;
    private @NonNull String updateddate;


	public Item() {
		// TODO Auto-generated constructor stub
	}
	
}
