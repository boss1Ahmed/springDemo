package com.example.demoaop;

import com.example.demoaop.config.AppConfig;
import com.example.demoaop.helper.Helper;
import com.example.demoaop.repository.CustomerRepository;
import com.example.demoaop.services.AccountService;
import com.example.demoaop.services.ICustomerService;
import com.example.demoaop.services.SendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DemoAopApplication implements CommandLineRunner {

    @Autowired
    CustomerRepository repository ;
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DemoAopApplication.class, args);
        /*
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoAopApplication.class);
        SendingService service = context.getBean(SendingService.class);
        service.sendMail();
         */

    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(repository.findAll(Helper.customerHasBirthday(18,25)));
    }
}
