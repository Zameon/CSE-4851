import factory.ProductFactory;
import models.Order;
import service.BasicOrderService;
import service.OrderService;
import service.decorator.EmailNotifDecorator;
import service.decorator.LoggingDecorator;
import strategy.BkashStrategy;
import strategy.PaymentStrategy;
import template.OrderProcessor;
import template.StandardProcessor;

public class App {
    public static void main(String[] args) throws Exception {
        Order order = new Order("Ramisa", "ramisa@gmail.com", "10/A Dhanmondi");
        order.addItem(ProductFactory.createProduct("Book", "b1", "Design Pattern", 350.0));
        order.addItem(ProductFactory.createProduct("Electronics", "e1", "iPad 5 Air", 55000.0));

        PaymentStrategy strategy = new BkashStrategy("01973006953");
        OrderService service = new EmailNotifDecorator(new LoggingDecorator(new BasicOrderService()));

        OrderProcessor processor = new StandardProcessor();
        processor.processOrder(order, service, strategy);

    }
}









