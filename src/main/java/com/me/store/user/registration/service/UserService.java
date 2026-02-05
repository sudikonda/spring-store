package com.me.store.user.registration.service;

import com.me.store.user.registration.entity.User;
import com.me.store.user.registration.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public void registerUser(User user) {
        if(userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("User with email " + user.getEmail() + " already exists");
        }
        userRepository.save(user);
        notificationService.sendNotification("User registered successfully", user.getEmail());
    }



}
