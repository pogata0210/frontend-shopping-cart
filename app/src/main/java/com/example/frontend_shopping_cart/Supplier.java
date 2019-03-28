package com.example.frontend_shopping_cart;



import java.io.Serializable;



public class Supplier
{

    int supplierid;
    String suppliername;
    private String address, city, state, zipcode,phonenumber;


    public Supplier() {
    }

    public Supplier(int supplierid, String suppliername, String address, String city, String state, String zipcode, String phonenumber) {
        this.supplierid = supplierid;
        this.suppliername = suppliername;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phonenumber = phonenumber;
    }

    public int getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(int supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}

   /** @SerializedName("supplier_id")
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
}**/
