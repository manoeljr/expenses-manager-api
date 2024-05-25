package com.expensesmanager.domain.service.product;

import com.expensesmanager.domain.model.Product;
import com.expensesmanager.domain.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product createProduct(Product newProduct) {
        return repository.save(newProduct);
    }

    @Override
    public Product updateProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public void deleteProduct(Integer idProduct) {
        repository.deleteById(idProduct);
    }

    @Override
    public Product getProduct(Integer idProduct) {
        return repository.findById(idProduct).orElse(null);
    }

    @Override
    public Product getProductByName(String name) {
        return repository.findByNameContaining(name);
    }

    @Override
    public Product getProductByPrice(BigDecimal price) {
        return repository.findByPrice(price);
    }

    @Override
    public Product getProductByDate(LocalDateTime creationDate) {
        return repository.findByCreationDate(creationDate);
    }

    @Override
    public List<Product> getProducts() {
        return repository.findAll();
    }
}
