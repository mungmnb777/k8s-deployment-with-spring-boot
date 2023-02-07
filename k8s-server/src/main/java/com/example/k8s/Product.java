package com.example.k8s;

public class Product {
    String brand;
    String product;

    public Product() {
    }

    public Product(String brand, String product) {
        this.brand = brand;
        this.product = product;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBrand() {
        return brand;
    }

    public String getProduct() {
        return product;
    }
}
