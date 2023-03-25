package ru.sharipov.home;

import java.util.List;

public class Customer {

    private String login;
    private Long password;
    private Basket customerBasket;

    public Customer (String login, Long password){
        this.login = login;
        this.password = password;
        this.customerBasket = new Basket();
    }

    public void buyProduct(ProductCategory category, String product){
        List<Product> cat = category.getListOfProducts();
        for (Product item: cat){
            if(item.getProductName().equals(product)){
                customerBasket.fillBasket(item);
                cat.remove(item);
            }
        }
    }

    public void purchasesInfo(){
        System.out.println();
        System.out.println("Customer " + this.login + " purchases");
        customerBasket.showProducts();
        System.out.println("----------------------------------------");
    }




}
