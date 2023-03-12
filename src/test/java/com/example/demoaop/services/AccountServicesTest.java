package com.example.demoaop.services;

import com.example.demoaop.models.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountServicesTest {
    @Autowired
    AccountService service ;

    @Autowired
    ICustomerService customerService;
    @Test
    void aspectAdviceShouldBeExecutedBeforeAccountHandler(){
        Executable action = () -> service.accountHandler();
        Assertions.assertThrows(RuntimeException.class,action);
    }


    @Test
    void getAllCustomerShouldReturnTheListOfTheCustomersStoredInH2(){
        /*for (int i = 0; i < 5; i++) {
            Customer customer = new Customer((long) i,"firstName"+i,"lastName" + i);
            customerService.saveCustomer(customer);
        }*/
        System.out.println(customerService.getAllCustomers());
    }
}
