package com.expensesmanager.domain.service.customer;

import com.expensesmanager.domain.model.Customer;

public interface CustomerService {
    Customer createCustomer(Customer newCustomer);
    Customer updateCustomer(Customer customer);
    Customer deleteCustomer(Integer idCustomer);
    Customer getCustomer(Integer idCustomer);
    Customer getCustomerByName(String name);
    Customer getCustomers();
}
