package com.example.androidnavigationdrawersample.model;

public class Product {

    private int id;
    private int productImage;
    private String productName;
    private float productPrice;
    private String productDelivery;


    public Product(int id, int image, String productName, float productPrice, String productDelivery) {
        this.id = id;
        this.productImage = image;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDelivery = productDelivery;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDelivery() {
        return productDelivery;
    }

    public void setProductDelivery(String productDelivery) {
        this.productDelivery = productDelivery;
    }

}
