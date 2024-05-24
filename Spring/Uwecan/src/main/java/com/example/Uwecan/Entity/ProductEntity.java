package com.example.Uwecan.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="tbl_product_details")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator= "hibernateseq")
    @SequenceGenerator(name="hibernateseq", sequenceName = "hibernate_sequence",allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    private String productName;
    private String productType;
    private Integer productQuantity;
    private String productImage;
    private Integer userId;
    private boolean isActive=true;
}
