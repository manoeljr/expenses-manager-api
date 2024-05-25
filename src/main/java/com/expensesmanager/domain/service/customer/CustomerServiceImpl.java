package com.expensesmanager.domain.service.customer;

import com.expensesmanager.domain.model.Customer;
import com.expensesmanager.domain.repository.CustomerRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer createCustomer(Customer newCustomer) {
        return repository.save(newCustomer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void deleteCustomer(Integer idCustomer) {
        repository.deleteById(idCustomer);
    }

    @Override
    public Customer getCustomer(Integer idCustomer) {
        return repository.findById(idCustomer).orElse(null);
    }

    @Override
    public Customer getCustomerByName(String name) {
        return repository.findCustomerByNameContainingIgnoreCase(name);
    }

    @Override
    public List<Customer> getCustomers() {
        return repository.findAll();
    }

}
