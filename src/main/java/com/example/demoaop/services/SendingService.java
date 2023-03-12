package com.example.demoaop.services;

import com.example.demoaop.mailSender.IMailSender;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class SendingService implements ISendingService {
    private IMailSender mailSender;
    Logger logger = Logger.getLogger("SendingService");

    public SendingService(IMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendMail() throws InterruptedException {
        logger.info("sending mail");
        for (int i = 0; i < 100; i++) {
            mailSender.send();
        }

        logger.info("mail sender invoked");
    }


}
