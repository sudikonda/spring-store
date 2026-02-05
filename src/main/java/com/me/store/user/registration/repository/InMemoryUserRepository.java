package com.me.store.user.registration.repository;

import com.me.store.user.registration.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Repository
public class InMemoryUserRepository implements UserRepository{
    private final Map<String, User> userMap = new HashMap<>();

    @Override
    public void save(User user) {
        log.info("Saving user: {}", user);
        userMap.put(user.getEmail(), user);
    }

    @Override
    public User findByEmail(String email) {
        log.info("Finding user by email: {}", email);
        return userMap.getOrDefault(email, null);
    }
}
