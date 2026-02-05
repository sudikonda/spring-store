package com.me.store.user.registration.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailNotificationService implements NotificationService{

    @Value("${mail.host}")
    private String mailHost;

    @Value("${mail.port}")
    private int mailPort;

    @Override
    public void sendNotification(String message, String recipientEmail) {
        log.info("Sending email to {} with message: {}, mailHost: {}, mailPort:{}", recipientEmail, message, mailHost, mailPort);
    }
}
