package com.expensesmanager.domain.service.product;

import com.expensesmanager.domain.model.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


public interface ProductService {
    Product createProduct(Product newProduct);
    Product updateProduct(Product product);
    void deleteProduct(Integer idProduct);
    Product getProduct(Integer idProduct);
    Product getProductByName(String name);
    Product getProductByPrice(BigDecimal price);
    Product getProductByDate(LocalDateTime creationDate);
    List<Product> getProducts();
}
