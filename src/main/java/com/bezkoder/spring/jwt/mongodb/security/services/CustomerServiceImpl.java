package com.bezkoder.spring.jwt.mongodb.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.jwt.mongodb.converter.CustomerRequestToCustomer;
import com.bezkoder.spring.jwt.mongodb.converter.ExpenseRequestToExpense;
import com.bezkoder.spring.jwt.mongodb.models.Customer;
import com.bezkoder.spring.jwt.mongodb.models.Expense;
import com.bezkoder.spring.jwt.mongodb.payload.request.CustomerRequest;
import com.bezkoder.spring.jwt.mongodb.payload.request.ExpenseRequest;
import com.bezkoder.spring.jwt.mongodb.repository.CustomerRepository;
import com.bezkoder.spring.jwt.mongodb.repository.ExpenseRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    private CustomerRequestToCustomer customerRequestToCustomer;
    private ExpenseRequestToExpense expenseRequestToExpense;
    private ExpenseRepository expenseRepository;
    
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, 
    		ExpenseRequestToExpense expenseRequestToExpense,
    		CustomerRequestToCustomer customerRequestToCustomer,
    		ExpenseRepository expenseRepository
    		) {
        this.customerRepository = customerRepository;
        this.customerRequestToCustomer = customerRequestToCustomer;
        this.expenseRequestToExpense = expenseRequestToExpense;
        this.expenseRepository = expenseRepository;
    }

    @Override
    public synchronized List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public synchronized Customer saveOrUpdate(CustomerRequest customerRequest) {
        return customerRepository.save(customerRequestToCustomer.convert(customerRequest));
    }
    

    
    @Override
    public synchronized Expense saveOrUpdateExpense(ExpenseRequest expenseRequest) {
        return expenseRepository.save(expenseRequestToExpense.convert(expenseRequest));
    }
    @Override
    public synchronized Customer findCustomerById(String id) {
        return customerRepository.findCustomerById(id);
    }

    
    @Override
    public synchronized Customer findCustomerByName(String name) {
        return customerRepository.findCustomerByName(name);
    }
    
    @Override
    public synchronized Expense findExpenseByCategory(String category) {
        return expenseRepository.findExpenseByCategory(category);
    }
    
    @Override
    public synchronized Expense findExpenseByCustomerId(String customerId) {
        return expenseRepository.findExpenseByCustomerId(customerId);
    }

    @Override
    public synchronized void delete(String id) {
        customerRepository.deleteById(id);
    }

    @Override
    public synchronized Customer findCustomerByEmail(String email) {
        return customerRepository.findCustomerByEmail(email);
    }
}
