package com.message.inventory.model.CustomerResponseDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderResponse {
    private Status status;
    private String message;

    public OrderResponse(Status status, String s) {
    }
}
