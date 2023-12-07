package com.example.demo.json.repo;

import com.example.demo.json.entit.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findAll();
    // You can add custom query methods here if needed

	Optional<Product> findById(Long id);

	Product save(Product product);
}
