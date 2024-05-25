package com.expensesmanager.domain.service.customer;

import com.expensesmanager.domain.model.Customer;
import com.expensesmanager.domain.repository.CustomerRepository;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer createCustomer(Customer newCustomer) {
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer deleteCustomer(Integer idCustomer) {
        return null;
    }

    @Override
    public Customer getCustomer(Integer idCustomer) {
        return null;
    }

    @Override
    public Customer getCustomerByName(String name) {
        return null;
    }

    @Override
    public Customer getCustomers() {
        return null;
    }

}
