package com.expensesmanager.domain.service.customer;

import com.expensesmanager.domain.model.Customer;

import java.util.List;


public interface CustomerService {
    Customer createCustomer(Customer newCustomer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Integer idCustomer);
    Customer getCustomer(Integer idCustomer);
    Customer getCustomerByName(String name);
    List<Customer> getCustomers();
}
