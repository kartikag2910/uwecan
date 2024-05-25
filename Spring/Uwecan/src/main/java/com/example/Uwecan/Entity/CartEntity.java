package com.example.Uwecan.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="tbl_user_cart_details")
@Data
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator= "hibernateseq")
    @SequenceGenerator(name="hibernateseq", sequenceName = "hibernate_sequence",allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    private Integer productId;
    private String product_info;
    private Integer userId;
    private Integer productQuantity;
    private String productName;

}
