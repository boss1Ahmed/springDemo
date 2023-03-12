package com.example.demoaop.services;


import com.example.demoaop.models.Customer;
import com.example.demoaop.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public void CustomerHandler(){
        System.out.println("from Customer Service");
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }


}
