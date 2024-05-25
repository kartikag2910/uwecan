package com.example.Uwecan.DTO;

import lombok.Data;

@Data
public class ProductDTO {
    private Integer id;
    private String product_name;
    private String product_type;
    private Integer product_quantity;
    private String product_info;
    private Integer userId;
    private boolean isActive;
}
