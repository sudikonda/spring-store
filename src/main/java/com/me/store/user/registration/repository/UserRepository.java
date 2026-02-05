package com.me.store.user.registration.repository;

import com.me.store.user.registration.entity.User;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
