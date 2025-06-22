package template;

import models.Order;

public class StandardProcessor extends OrderProcessor {
    @Override
    protected void validateOrder(Order order) {
        System.out.println("Validating standard order...");
    }
}
