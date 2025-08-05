package com.yal.store.Exercises.UserRegistrationService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailNotificationService implements NotificationService {
    @Value("${exercises.user-registration-service.mail.host}")
    private String host;

    @Value("${exercises.user-registration-service.mail.port}")
    private int port;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Message: " + message);
        System.out.println("Recipient email: " + recipientEmail);
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
    }
}
