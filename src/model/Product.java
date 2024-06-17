package model;

public class Product implements Comparable<Product> {
    private String productName,productId;
    private double price;
    public Product(String productName, String productId, double price) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [productName=" + productName + ", productId=" + productId + ", price=" + price + "]";
    }
    @Override
    public int compareTo(Product o) {
        return price > o.price ? 1 : price < o.price ? -1 : 0;
    } 
    
    

}
