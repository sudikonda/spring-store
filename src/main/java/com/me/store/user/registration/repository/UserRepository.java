package com.me.store.user.registration.repository;

import com.me.store.user.registration.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
