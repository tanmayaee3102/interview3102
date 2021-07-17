package com.bezkoder.spring.jwt.mongodb.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.jwt.mongodb.models.Expense;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {
    List<Expense> findAll();

    Expense findExpenseByCustomerId(String customerId);
    
    Expense findExpenseByCategory(String category);
    
    Expense findExpenseByCreatedDate(Date createdDate);
}
