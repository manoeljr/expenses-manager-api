package com.expensesmanager.web.controller;


import com.expensesmanager.domain.model.Product;
import com.expensesmanager.domain.service.product.ProductService;
import org.hibernate.annotations.Array;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product newProduct) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createProduct(newProduct));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer id, @RequestBody Product product) {
        Product productToUpdate = service.getProduct(id);
        if (productToUpdate != null) {
            product.setCodProduto(productToUpdate.getCodProduto());
            return ResponseEntity.ok(service.updateProduct(product));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id) {
        service.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer id) {
        Product product = service.getProduct(id);
        if (product != null) {
            return ResponseEntity.ok(product);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Product> getProductByName(@PathVariable String name) {
        Product product = service.getProductByName(name);
        if (product != null) {
            return ResponseEntity.ok(product);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/price/{price}")
    public ResponseEntity<Product> getProductByPrice(@PathVariable BigDecimal price) {
        Product product = service.getProductByPrice(price);
        if (product != null) {
            return ResponseEntity.ok(product);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/date/{creationDate}")
    public ResponseEntity<Product> getProductByDate(@PathVariable LocalDateTime creationDate) {
        Product product = service.getProductByDate(creationDate);
        if (product != null) {
            return ResponseEntity.ok(product);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(Objects.requireNonNullElseGet(service.getProducts(), ArrayList::new));
    }

}
