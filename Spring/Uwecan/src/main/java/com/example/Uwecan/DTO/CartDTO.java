package com.example.Uwecan.DTO;

import lombok.Data;

@Data
public class CartDTO {
    private Integer id;
    private Integer productId;
    private Integer UserId;
    private Integer productQuantity;
    private String productName;
}
