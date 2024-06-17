package model;

import java.util.ArrayList;

public class Order{
    private String orderId, dataOrder;
    private Customer cusName; // An
    private ArrayList<Product> ListProduct; // Bánh Canh, Bún Chả, Bánh Tôm
    public Order(String orderId, String dataOrder, Customer cusName, ArrayList<Product> ListProduct) {
        this.orderId = orderId;
        this.dataOrder = dataOrder;
        this.cusName = cusName;
        this.ListProduct = ListProduct;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getDataOrder() {
        return dataOrder;
    }
    public void setDataOrder(String dataOrder) {
        this.dataOrder = dataOrder;
    }
    public Customer getCusName() {
        return cusName;
    }
    public void setCusName(Customer cusName) {
        this.cusName = cusName;
    }
    public ArrayList<Product> getListProduct() {
        return ListProduct;
    }
    public void setListProduct(ArrayList<Product> ListProduct) {
        this.ListProduct = ListProduct;
    }
    public void addProduct(Product product) {
        ListProduct.add(product);
    }
    
    
    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", dataOrder=" + dataOrder + ", cusName=" + cusName + ", ListProduct="
                + ListProduct + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (orderId == null) {
            if (other.orderId != null)
                return false;
        } else if (!orderId.equals(other.orderId))
            return false;
        return true;
    }
    public static void main(String[] args) {
        Customer cus = new Customer("An","20","Male","JP");
        Product prod1 = new Product("Bánh Canh","1",10000);
        Product prod2 = new Product("Bún Chả","2",20000);
        Product prod3 = new Product("Bánh Tôm","3",30000);
        ArrayList<Product> listProdAn = new ArrayList<>(); 
        listProdAn.add(prod1);
        listProdAn.add(prod2);
        listProdAn.add(prod3);
        Order orderAn = new Order("1","2024-06-17",cus,listProdAn); 
        Product prod4 = new Product("Bánh Mì","4",40000);  
        orderAn.addProduct(prod4);
        for (Product product : orderAn.getListProduct()) {
            System.out.println(product.getProductName() + " " + product.getPrice());
        }
    }

    



}