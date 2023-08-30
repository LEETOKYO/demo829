package com.example.demo829.entity.repository;
import com.example.demo829.entity.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
