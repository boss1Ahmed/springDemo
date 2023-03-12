package com.example.demoaop.services;


import org.springframework.stereotype.Service;

@Service
public class AccountService  {
    public void accountHandler(){
        System.out.println("from Account Service");
    }

}
