package com.me.store;

import com.me.store.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringStoreApplication {

    static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringStoreApplication.class, args);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

    }

}
