package com.expensesmanager.domain.repository;

import com.expensesmanager.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
