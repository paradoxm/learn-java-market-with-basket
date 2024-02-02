package org.example;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Product> products;

    public Basket() {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
