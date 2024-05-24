package com.example.Uwecan.Repository;

import com.example.Uwecan.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
    List<ProductEntity> findByUserId(Integer id);

    List<ProductEntity> findByProductType(String productType);

}
