package com.me.store;

import com.me.store.user.registration.entity.Address;
import com.me.store.user.registration.entity.Tag;
import com.me.store.user.registration.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringStoreApplication.class, args);

        User johnUser = User.builder().name("John").email("john@example.com").password("password").build();
        System.out.println(johnUser);

        Address address = Address.builder().street("123 Main St").city("Anytown").zip("12345").state("CA").build();
        System.out.println(address);

        johnUser.addAddress(address);
        System.out.println(johnUser);

        johnUser.addTag("admin");
        System.out.println(johnUser);

    }
}
