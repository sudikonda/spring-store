package com.me.store.user.registration.service;

import com.me.store.user.registration.entity.Address;
import com.me.store.user.registration.entity.User;
import com.me.store.user.registration.repository.AddressRepository;
import com.me.store.user.registration.repository.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final EntityManager entityManager;
    private final AddressRepository addressRepository;

    @Transactional
    public void showEntityStates() {
        User user = User.builder().name("John").email("john@example.com").password("password").build();
        if (entityManager.contains(user)) {
            log.info("User is already in the persistence context");
        } else {
            log.info("User is not in the persistence context - Transient/Detached");
        }
        userRepository.save(user);
        if (entityManager.contains(user)) {
            log.info("User is already in the persistence context");
        } else {
            log.info("User is not in the persistence context - Transient/Detached");
        }
    }

    @Transactional
    public void showRelatedEntities() {
        User user = userRepository.findById(1L).orElseThrow();
        log.info(user.getEmail());
    }

    public void fetchAddresses() {
        Address address = addressRepository.findById(1L).orElseThrow();
        log.info(address.getCity());
    }
}
