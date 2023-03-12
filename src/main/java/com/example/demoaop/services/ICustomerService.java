package com.example.demoaop.services;

import com.example.demoaop.models.Customer;

import java.util.List;

public interface ICustomerService {
    void CustomerHandler();
    List<Customer> getAllCustomers();
    void saveCustomer(Customer customer);
}
