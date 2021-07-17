package com.bezkoder.spring.jwt.mongodb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "customers")
public class Customer {

    @Id
    private String id;

    private @NonNull String name;

    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private @NonNull String email;
    
    @Size(min=10,max=10)
    private @NonNull Long mobileno;
    
    private @NonNull Date createdDate;
    
    
}
