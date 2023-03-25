package ru.sharipov.home;

public class Product {

    private String productName;
    private double productPrice;
    private double productRating;

    public Product(String productName, double productPrice, double productRating){
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductRating() {
        return productRating;
    }

    public void setProductRating(double productRating) {
        this.productRating = productRating;
    }
}
