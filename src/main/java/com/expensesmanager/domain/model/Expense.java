package com.expensesmanager.domain.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codExpense;
    private String description;
    private Double value;
    private LocalDateTime dateExpense;
    @ManyToOne
    @JoinColumn(name = "cod_category")
    private Category category;

    public Integer getCodExpense() {
        return codExpense;
    }

    public void setCodExpense(Integer codExpense) {
        this.codExpense = codExpense;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDateTime getDateExpense() {
        return dateExpense;
    }

    public void setDateExpense(LocalDateTime dateExpense) {
        this.dateExpense = dateExpense;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;
        return Objects.equals(codExpense, expense.codExpense);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codExpense);
    }
}
