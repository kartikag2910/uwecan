package com.example.Uwecan.Service.ServiceImpl;

import com.example.Uwecan.DTO.CartDTO;
import com.example.Uwecan.DTO.ProductDTO;
import com.example.Uwecan.Entity.CartEntity;
import com.example.Uwecan.Entity.ProductEntity;
import com.example.Uwecan.Repository.CartRepository;
import com.example.Uwecan.Repository.ProductRepository;
import com.example.Uwecan.Service.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CartRepository cartRepository;


    @Override
    public String addProduct(ProductDTO productDTO) {
        ProductEntity productEntity=new ProductEntity();
        productEntity.setProductName(productDTO.getProduct_name());
        productEntity.setProductType(productDTO.getProduct_type());
        productEntity.setProductQuantity(productDTO.getProduct_quantity());
        productEntity.setProductInfo(productDTO.getProduct_type());
        productEntity.setUserId(productDTO.getUserId());
        productRepository.save(productEntity);
        return "Success";
    }

    @Override
    public String deleteProduct(Integer id) {
        productRepository.deleteById(id);
        return "Success";
    }

    @Override
    public List<ProductDTO> getProductByUser(Integer id) {
       List<ProductEntity> productEntities=productRepository.findByUserId(id);
       List<ProductDTO> productDTOS=new ArrayList<>();
       for(ProductEntity productEntity:productEntities){
           ProductDTO productDTO=new ProductDTO();
           productDTO.setProduct_name(productEntity.getProductName());
           productDTO.setProduct_quantity(productEntity.getProductQuantity());
           productDTO.setProduct_info(productEntity.getProductInfo());
           productDTO.setProduct_type(productEntity.getProductType());
           productDTO.setProduct_info(productEntity.getProductInfo());
           productDTO.setUserId(productEntity.getUserId());
           productDTO.setId(productEntity.getId());
           productDTOS.add(productDTO);
       }
       return productDTOS;
    }

    @Override
    public List<ProductDTO> getByProductType(String productType) {
        List<ProductDTO> productDTOS=new ArrayList<>();
        List<ProductEntity> productEntities=productRepository.findByProductType(productType);
        for(ProductEntity productEntity:productEntities){
            if(productEntity.getProductQuantity()>0) {
                ProductDTO productDTO = new ProductDTO();
                productDTO.setProduct_name(productEntity.getProductName());
                productDTO.setProduct_quantity(productEntity.getProductQuantity());
                productDTO.setProduct_info(productEntity.getProductInfo());
                productDTO.setProduct_type(productEntity.getProductType());
                productDTO.setId(productEntity.getId());
                productDTOS.add(productDTO);
            }
        }
        return productDTOS;
    }


    @Transactional
    @Override
    public String addProductToCart(CartDTO cartDTO) {
        ProductEntity productEntity=productRepository.getReferenceById(cartDTO.getProductId());
        productEntity.setProductQuantity(productEntity.getProductQuantity()-1);
        CartEntity cartEntity=new CartEntity();
        cartEntity.setProductId(cartDTO.getProductId());
        cartEntity.setProduct_info(cartDTO.getProduct_info());
        cartEntity.setProductName(cartDTO.getProductName());
        cartEntity.setUserId(cartDTO.getUserId());
        cartEntity.setProductQuantity(cartDTO.getProductQuantity());
        cartRepository.save(cartEntity);
        return "Success";
    }

    @Override
    public List<CartDTO> getCartDetails(Integer id) {
        List<CartDTO> cartDTOS=new ArrayList<>();
        List<CartEntity> cartEntities=cartRepository.findByUserId(id);
        for(CartEntity cartEntity:cartEntities){
            CartDTO cartDTO=new CartDTO();
            cartDTO.setProductId(cartEntity.getProductId());
            cartDTO.setProductName(cartEntity.getProductName());
            cartDTO.setProduct_info(cartEntity.getProduct_info());
            cartDTO.setProductQuantity(cartEntity.getProductQuantity());
            cartDTO.setUserId(cartEntity.getUserId());
            cartDTOS.add(cartDTO);
        }
        return cartDTOS;
    }






}
