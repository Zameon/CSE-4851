package service;

import models.Order;
import strategy.PaymentStrategy;

public interface OrderService {
    void placeOrder(Order order, PaymentStrategy strategy);
}
