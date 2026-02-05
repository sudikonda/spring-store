package com.me.store;

import com.me.store.service.OrderService;
import com.me.store.user.registration.entity.User;
import com.me.store.user.registration.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringStoreApplication {

    static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringStoreApplication.class, args);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        UserService userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L, "John", "john@example.com", "password"));
        userService.registerUser(new User(1L, "John", "john@example.com", "password"));

    }

}
