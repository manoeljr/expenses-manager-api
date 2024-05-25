package com.expensesmanager.domain.service.product;

import com.expensesmanager.domain.model.Product;


public interface ProductService {
    Product createProduct(Product newProduct);
    Product updateProduct(Product product);
    Product deleteProduct(Integer idProduct);
    Product getProduct(Integer idProduct);
    Product getProductByName(String name);
    Product getProducts();
}
