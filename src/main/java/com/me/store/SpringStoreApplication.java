package com.me.store;

import com.me.store.user.registration.entity.Address;
import com.me.store.user.registration.entity.Category;
import com.me.store.user.registration.entity.Product;
import com.me.store.user.registration.entity.Profile;
import com.me.store.user.registration.entity.Tag;
import com.me.store.user.registration.entity.User;
import com.me.store.user.registration.repository.AddressRepository;
import com.me.store.user.registration.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringStoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringStoreApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);
        AddressRepository addressRepository = context.getBean(AddressRepository.class);

        User johnUser = User.builder().name("John").email("john@example.com").password("password").build();
        userRepository.save(johnUser);
        System.out.println(johnUser);

        Address address = Address.builder().street("123 Main St").city("Anytown").zip("12345").state("CA").build();
        johnUser.addAddress(address);
        addressRepository.save(address);
        System.out.println(address);

        userRepository.findById(1L).ifPresent(user -> {
            System.out.println(user);
        });

        johnUser.addAddress(address);
        System.out.println(johnUser);

        johnUser.addTag("admin");
        System.out.println(johnUser);

        Profile profile = Profile.builder().bio("John's bio").build();
        johnUser.setProfile(profile);
        profile.setUser(johnUser);
        System.out.println(johnUser);

        Category category = Category.builder().name("Electronics").build();
        System.out.println(category);

        Product product = Product.builder().name("Laptop").price(new BigDecimal("1000")).category(category).build();
        System.out.println(product);


    }
}
