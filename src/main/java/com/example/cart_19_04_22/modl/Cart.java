package com.example.cart_19_04_22.modl;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Integer> addId(List<Integer> item) {
        items.addAll(item);
        return item;
    }

    public List<Integer> getId(){
        return new ArrayList<Integer>(items);
    }
}
