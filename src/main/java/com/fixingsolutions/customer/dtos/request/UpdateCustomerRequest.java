package com.fixingsolutions.customer.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateCustomerRequest {
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private String phone;
}
