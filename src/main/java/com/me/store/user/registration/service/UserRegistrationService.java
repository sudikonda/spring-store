package com.me.store.user.registration.service;

import com.me.store.user.registration.entity.User;
import com.me.store.user.registration.repository.UserRegistrationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserRegistrationService {

    private final UserRegistrationRepository userRegistrationRepository;
    private final NotificationService notificationService;

    public void registerUser(User user) {
        if(userRegistrationRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("User with email " + user.getEmail() + " already exists");
        }
        userRegistrationRepository.save(user);
        notificationService.sendNotification("User registered successfully", user.getEmail());
    }



}
