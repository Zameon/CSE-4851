package service.decorator;

import models.Order;
import service.OrderService;
import strategy.PaymentStrategy;

public class LoggingDecorator extends OrderServiceDecorator {
    public LoggingDecorator(OrderService svc) 
    { 
        super(svc); 
    }
    @Override
    public void placeOrder(Order order, PaymentStrategy strategy) {
        System.out.println("[LOG] Starting order placement");
        super.placeOrder(order, strategy);
        System.out.println("[LOG] Order placement finished");
    }
}
