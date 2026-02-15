package com.me.store;

import com.me.store.service.OrderService;
import com.me.store.user.registration.entity.User;
import com.me.store.user.registration.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringStoreApplication.class, args);

        User johnUser = User.builder().name("John").email("john@example.com").password("password").build();
        System.out.println(johnUser);
    }

    @Bean
    CommandLineRunner run(OrderService orderService, UserService userService) {
        return args -> {
            orderService.placeOrder();
            userService.registerUser(new User(1L, "John", "john@example.com", "password"));
        };
    }

}
