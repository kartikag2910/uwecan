package com.example.Uwecan.Service;

import com.example.Uwecan.DTO.CartDTO;
import com.example.Uwecan.DTO.ProductDTO;

import java.util.List;

public interface ProductService {

    String addProduct(ProductDTO productDTO);

    String deleteProduct(Integer id);

    List<ProductDTO> getProductByUser(Integer id);

    List<ProductDTO> getByProductType(String productType);

    String addProductToCart(CartDTO cartDTO);

    List<CartDTO> getCartDetails(Integer id);
}
