package com.expensesmanager.domain.service.product;

import com.expensesmanager.domain.model.Product;
import com.expensesmanager.domain.repository.ProductRepository;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product createProduct(Product newProduct) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(Integer idProduct) {
        return null;
    }

    @Override
    public Product getProduct(Integer idProduct) {
        return null;
    }

    @Override
    public Product getProductByName(String name) {
        return null;
    }

    @Override
    public Product getProducts() {
        return null;
    }
}
