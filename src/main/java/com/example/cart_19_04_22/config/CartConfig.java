package com.example.cart_19_04_22.config;

import com.example.cart_19_04_22.modl.Cart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class CartConfig {
    @Bean
    @SessionScope
    public Cart creitCart(){
        return new Cart();
    }

}
