package com.example.frontend_shopping_cart;



import java.io.Serializable;

public class Product
{
    int productid;
    String productname, thumbImageUrl, description;
    double price;
   //boolean price;
    private int qtyinstock;

    public Product()
    {
    }

    public Product(int productid, String productname, String description, String thumbImageUrl, double price, int qtyinstock)
    {
        this.productid = productid;
        this.productname = productname;
        this.description = description;
        this.thumbImageUrl = thumbImageUrl;
        this.price = price;
        this.qtyinstock = qtyinstock;
    }

    public int getProductid()
    {
        return productid;
    }

    public void setProductid(int productid)
    {
        this.productid = productid;
    }

    public String getProductname()
    {
        return productname;
    }

    public void setProductname(String productname)
    {
        this.productname = productname;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getThumbImageUrl()
    {
        return thumbImageUrl;
    }

    public void setThumbImageUrl(String thumbImageUrl
    ) {
        this.thumbImageUrl = thumbImageUrl;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getQtyinstock()
    {
        return qtyinstock;
    }

    public void setQtyinstock(int qtyinstock)
    {
        this.qtyinstock = qtyinstock;
    }

   /** @SerializedName("id")
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
    } **/

}