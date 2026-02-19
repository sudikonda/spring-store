package com.me.store;

import com.me.store.user.registration.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringStoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringStoreApplication.class, args);

        UserService userService = context.getBean(UserService.class);
        userService.showEntityStates();
        userService.showRelatedEntities();
        userService.fetchAddresses();



    }
}
