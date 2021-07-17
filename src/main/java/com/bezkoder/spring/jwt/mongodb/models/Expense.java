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
@Document(collection = "expenses")
public class Expense {

    @Id
    private String id;
    
    private @NonNull String customerId;
    
    private @NonNull String category;
    
    private @NonNull Long totalIncome;
    
    private @NonNull Long totalExpense;

    private @NonNull Long saving;
    
    private @NonNull Date createdDate;
    
    
}
