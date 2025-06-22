package models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerID;
    private String customerEmail;
    private String shippingAddress;
    private List<Product> items = new ArrayList<>();

    public Order(String customerId, String customerEmail, String shippingAddress) {
        this.customerID = customerId;
        this.customerEmail = customerEmail;
        this.shippingAddress = shippingAddress;
    }
    public void addItem(Product product) {
        items.add(product);
    }
    public List<Product> getItems() {
        return items;
    }
    public double getTotal() {
        double sum = 0.0;
        for(Product p : items) sum += p.getPrice();
        return sum;
    }
   
    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getShippingAddress() {
        return shippingAddress;
    }

}
