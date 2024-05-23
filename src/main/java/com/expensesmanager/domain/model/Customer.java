package com.expensesmanager.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codCustomer;
    private String name;
    private String email;

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
