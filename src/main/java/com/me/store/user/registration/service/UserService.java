package com.me.store.user.registration.service;

import com.me.store.user.registration.entity.User;
import com.me.store.user.registration.repository.UserRepository;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final EntityManager entityManager;

    public void showEntityStates() {
        User user = User.builder().name("John").email("john@example.com").password("password").build();
        if (entityManager.contains(user)) {
            System.out.println("User is already in the persistence context");
        } else {
            System.out.println("User is not in the persistence context - Transient/Detached");
        }
        userRepository.save(user);
        if (entityManager.contains(user)) {
            System.out.println("User is already in the persistence context");
        } else {
            System.out.println("User is not in the persistence context - Transient/Detached");
        }
    }
}
