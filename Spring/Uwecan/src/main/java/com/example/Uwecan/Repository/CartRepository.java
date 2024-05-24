package com.example.Uwecan.Repository;

import com.example.Uwecan.Entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<CartEntity,Integer> {

    List<CartEntity> findByUserId(Integer id);
}
