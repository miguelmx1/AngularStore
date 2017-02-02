package com.moram;
public class Product {

    private final long productId;
    private final String description;
    private final double price;
    private final String imageURL;

    public Product(long productId, String description, double price, String imageURL) {
        this.productId = productId;
        this.description = description;
        this.price = price;
        this.imageURL = imageURL;
    }

    public long getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getImageURL() {
        return imageURL;
    }
}
