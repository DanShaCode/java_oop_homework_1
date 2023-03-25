package ru.sharipov.home;


import java.util.ArrayList;
import java.util.List;

public class ProductCategory {

    private String categoryName;

    private List<Product> listOfProduct;

    public ProductCategory(String categoryName){
        this.categoryName = categoryName;
        listOfProduct = new ArrayList<>();
    }

    public void addToCategory(Product product1, Product product2, Product product3){
        listOfProduct.add(product1);
        listOfProduct.add(product2);
        listOfProduct.add(product3);

    }

    public void showCategoryProducts(){
        System.out.println();
        System.out.println("Category name: " + this.categoryName);
        System.out.println();
        for(Product product: listOfProduct){
            System.out.println(
                    "name: "+ product.getProductName() + " | "
                            +  "price: " + product.getProductPrice() + " ₽ | "
                            + "rating: " + product.getProductRating() + " | ");
        }
        System.out.println("----------------------------------------");
    }

    public List<Product> getListOfProducts(){
        return listOfProduct;
    }


}
