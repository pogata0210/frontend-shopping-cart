package com.example.frontend_shopping_cart;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Supplier implements Serializable {

    @SerializedName("supplier_id")
    private long supplierId;

    @SerializedName("name")
    private String name;

    public Supplier(long supplierId, String name) {
        this.supplierId = supplierId;
        this.name = name;
    }

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}