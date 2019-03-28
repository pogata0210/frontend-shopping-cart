package com.example.frontend_shopping_cart;


public class Dao{
    private static final String serverAddress = "http://192.168.0.4:8080";
    public static final String BASE_URL = "http://10.0.2.2:8080/";
    public static final String PRODUCT_URL = BASE_URL + "/product";

    public interface ObjectCallback<T> {
        void returnObjects(T object);
    }
}