package com.example.Uwecan.DTO;

import lombok.Data;

@Data
public class CartDTO {
    private Integer id;
    private Integer productId;
    private String product_info;
    private Integer UserId;
    private Integer productQuantity;
    private String productName;
}
