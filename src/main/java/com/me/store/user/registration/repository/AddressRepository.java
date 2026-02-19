package com.me.store.user.registration.repository;

import com.me.store.user.registration.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}