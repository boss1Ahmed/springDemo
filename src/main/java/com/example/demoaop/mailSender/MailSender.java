package com.example.demoaop.mailSender;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class MailSender implements IMailSender{
    Logger logger = Logger.getLogger("MailSender");

    @Async()
    @Override
    public void send() throws InterruptedException {
        Thread.sleep(2000);
        logger.info("mail sent");
    }
}
