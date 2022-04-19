package com.example.cart_19_04_22.service.impl;

import com.example.cart_19_04_22.modl.Cart;
import com.example.cart_19_04_22.service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addId(List<Integer> item) {
        return cart.addId(item);
    }

    @Override
    public List<Integer> getId() {
        return cart.getId();
    }
}
