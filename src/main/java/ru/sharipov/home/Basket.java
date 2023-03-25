package ru.sharipov.home;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Product> basket;

    public Basket(){
        this.basket = new ArrayList<>();
    }

    public void fillBasket(Product product){
        basket.add(product);
    }

    public void showProducts(){
        int count = 1;
        for (Product product: basket){
            System.out.println(count++ + ". " + product.getProductName());
        }
    }

}
