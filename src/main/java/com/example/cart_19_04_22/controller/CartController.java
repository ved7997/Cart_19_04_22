package com.example.cart_19_04_22.controller;

import com.example.cart_19_04_22.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
@GetMapping("/add")
   public List<Integer> addId(@RequestParam List<Integer> item){
        return cartService.addId(item);
    }
@GetMapping("/get")
   public List<Integer> getId(){
        return cartService.getId();
    }
}
