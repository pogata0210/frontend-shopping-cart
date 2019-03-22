package com.example.frontend_shopping_cart;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Product implements Serializable {

    @SerializedName("id")
    private long Id;

    @SerializedName("product_name")
    private String productName;

    @SerializedName("product_description")
    private String productDescription;

    @SerializedName("price")
    private double price;

    @SerializedName("quantity")
    private int quantity;

    public Product(long productId,
                   String productName,
                   String productDescription,
                   double price,
                   int quantity) {
        this.Id = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.quantity = quantity;
    }

}