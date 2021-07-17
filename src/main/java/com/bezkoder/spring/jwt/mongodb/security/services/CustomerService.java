package com.bezkoder.spring.jwt.mongodb.security.services;



import java.util.List;

import com.bezkoder.spring.jwt.mongodb.models.Customer;
import com.bezkoder.spring.jwt.mongodb.models.Expense;
import com.bezkoder.spring.jwt.mongodb.payload.request.CustomerRequest;
import com.bezkoder.spring.jwt.mongodb.payload.request.ExpenseRequest;

public interface CustomerService {
    List<Customer> findAll();

    Customer saveOrUpdate(CustomerRequest customerRequest);
    
    Expense saveOrUpdateExpense(ExpenseRequest expenseRequest);
    
    Customer findCustomerById(String id);

    Customer findCustomerByName(String name);
    
    Expense findExpenseByCategory(String category);
    
    Expense findExpenseByCustomerId(String customerId);

    Customer findCustomerByEmail(String email);

    void delete(String id);
}
