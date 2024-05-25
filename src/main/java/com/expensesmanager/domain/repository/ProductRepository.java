package com.expensesmanager.domain.repository;

import com.expensesmanager.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByNameContaining(String name);
    Product findByPrice(BigDecimal price);
    Product findByCreationDate(LocalDateTime creationDate);
}
