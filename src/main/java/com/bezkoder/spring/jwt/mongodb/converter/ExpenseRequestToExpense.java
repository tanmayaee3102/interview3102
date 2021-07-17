package com.bezkoder.spring.jwt.mongodb.converter;


import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.bezkoder.spring.jwt.mongodb.models.Expense;
import com.bezkoder.spring.jwt.mongodb.payload.request.ExpenseRequest;

@Component
public class ExpenseRequestToExpense implements Converter<ExpenseRequest, Expense> {

    @Override
    public Expense convert(ExpenseRequest expenseRequest) {
    	Expense expense = new Expense();
        if (!StringUtils.isEmpty(expenseRequest.getId())) {
        	expense.setId(expenseRequest.getId());
        }
        expense.setCustomerId(expenseRequest.getCustomerId());
        expense.setCategory(expenseRequest.getCategory());
        expense.setTotalIncome(expenseRequest.getTotalIncome());
        expense.setTotalExpense(expenseRequest.getTotalExpense());
        expense.setSaving(expenseRequest.getTotalIncome()-expenseRequest.getTotalExpense());
        expense.setCreatedDate(new Date());
        return expense;
    }
}
