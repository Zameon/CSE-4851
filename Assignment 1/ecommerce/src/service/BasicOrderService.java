package service;

import models.Order;
import models.Product;
import strategy.PaymentStrategy;

public class BasicOrderService implements OrderService {
    @Override
    public void placeOrder(Order order, PaymentStrategy strategy)
    {
        strategy.pay(order.getTotal());
        System.out.println("Order placed for " + order.getItems().size() + " items.");
        System.out.println("Items: ");
        for (Product p : order.getItems())
        {
            System.out.println("    - " + p.getName());
        }
    }
}
