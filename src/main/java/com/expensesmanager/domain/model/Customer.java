package com.expensesmanager.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codCustomer;
    private String name;
    private String email;
    @JsonIgnore
    @OneToMany(mappedBy = "customer")
    private List<Product> products;

    public Integer getCodCustomer() {
        return codCustomer;
    }

    public void setCodCustomer(Integer codCustomer) {
        this.codCustomer = codCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(codCustomer, customer.codCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codCustomer);
    }
}
