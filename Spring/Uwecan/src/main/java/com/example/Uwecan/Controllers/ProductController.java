package com.example.Uwecan.Controllers;

import com.example.Uwecan.DTO.CartDTO;
import com.example.Uwecan.DTO.ProductDTO;
import com.example.Uwecan.DTO.UserDetailsDTO;
import com.example.Uwecan.Service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    @Operation(summary = "To add a new product.")
    public String addUser(@RequestBody ProductDTO productDTO){
        return productService.addProduct(productDTO);
    }

    @DeleteMapping("/deleteProduct")
    @Operation(summary = "To delete a product.")
    public String deleteProduct(Integer id){
        return productService.deleteProduct(id);
    }

    @GetMapping("/getProducts")
    @Operation(summary = "To get products by userId.")
    public List<ProductDTO> getProductByUser(Integer id){
        return productService.getProductByUser(id);
    }
    @GetMapping("/getByProductType")
    @Operation(summary = "To get product by type.")
    public List<ProductDTO> getByProductType(String productType){
        return productService.getByProductType(productType);
    }

    @PostMapping("/addProductToCart")
    @Operation(summary = "To add product to cart.")
    public String addProductToCart(CartDTO cartDTO){
        return productService.addProductToCart(cartDTO);
    }

    @GetMapping("/getCartDetails")
    @Operation(summary = "To get cart details.")
    public List<CartDTO> getCartDetails(Integer id){
        return productService.getCartDetails(id);
    }




}
