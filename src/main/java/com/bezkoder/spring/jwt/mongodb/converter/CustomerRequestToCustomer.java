package com.bezkoder.spring.jwt.mongodb.converter;


import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.bezkoder.spring.jwt.mongodb.models.Customer;
import com.bezkoder.spring.jwt.mongodb.payload.request.CustomerRequest;

@Component
public class CustomerRequestToCustomer implements Converter<CustomerRequest, Customer> {

    @Override
    public Customer convert(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        if (!StringUtils.isEmpty(customerRequest.getId())) {
            customer.setId(customerRequest.getId());
        }
        customer.setEmail(customerRequest.getEmail());
        customer.setName(customerRequest.getName());
        customer.setMobileno(customerRequest.getMobileno());
        customer.setCreatedDate(new Date());
        return customer;
    }
}
