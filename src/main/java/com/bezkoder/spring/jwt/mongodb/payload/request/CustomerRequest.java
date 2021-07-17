package com.bezkoder.spring.jwt.mongodb.payload.request;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest extends BaseRequest {

    private String name;
    private String email;
    private Long mobileno;
    private Date createdDate;
}
