package com.bezkoder.spring.jwt.mongodb.payload.request;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseRequest extends BaseRequest {

	private String customerId;
	
	private String category;
    
    private Long totalIncome;
    
    private Long totalExpense;

    private Long saving;
    
    private Date createdDate;
}
