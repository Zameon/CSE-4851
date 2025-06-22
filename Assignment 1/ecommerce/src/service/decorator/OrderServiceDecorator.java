package service.decorator;

import models.Order;
import service.OrderService;
import strategy.PaymentStrategy;

public abstract class OrderServiceDecorator implements OrderService {
    protected OrderService wrapee;

    public OrderServiceDecorator(OrderService wrapee) {
        this.wrapee = wrapee;
    }
    
    @Override
    public void placeOrder(Order order, PaymentStrategy strategy)
    {
        wrapee.placeOrder(order, strategy);
    }

}
