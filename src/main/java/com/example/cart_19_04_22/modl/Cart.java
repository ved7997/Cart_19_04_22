package com.example.cart_19_04_22.modl;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Integer> itams;

    public Cart() {
        this.itams = new ArrayList<>();
    }

    public List<Integer> addId(List<Integer> item){
        itams.addAll(item);
        return item;
    }

    public List<Integer> getId(){
        return new ArrayList<Integer>(itams);
    }
}
