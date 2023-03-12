package com.example.demoaop.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SendingServiceTest {
    @Autowired
    ISendingService sendingService;
    @Test
    void sendMailTest() throws InterruptedException {
        sendingService.sendMail();
    }
}
