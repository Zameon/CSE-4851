package template;

import models.Order;
import service.OrderService;
import strategy.PaymentStrategy;

public abstract class OrderProcessor {
    public final void processOrder(Order order, OrderService orderService, PaymentStrategy strategy)
    {
        validateOrder(order);
        orderService.placeOrder(order, strategy);
        shipOrder(order);

    }

    protected abstract void validateOrder(Order order);
    protected void shipOrder(Order order)
    {
        System.out.println("Shipping to " + order.getShippingAddress());
    }
}
