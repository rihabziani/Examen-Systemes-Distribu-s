package com.example.customerservice.commonapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Data
public class CreditAccountRequestDTO {
    private String AccountId ;
    private String currency ;
    private double amount;
}
