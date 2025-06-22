package service.decorator;

import models.Order;
import service.OrderService;
import strategy.PaymentStrategy;

public class EmailNotifDecorator extends OrderServiceDecorator {
    public EmailNotifDecorator(OrderService svc) 
    { 
        super(svc); 
    }
    @Override
    public void placeOrder(Order order, PaymentStrategy strategy) 
    {
        super.placeOrder(order, strategy);
        System.out.println("[NOTIFY] Email sent to " + order.getCustomerEmail());    
    }
}
