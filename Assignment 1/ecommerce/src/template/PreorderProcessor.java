package template;

import models.Order;

public class PreorderProcessor extends OrderProcessor {
    @Override
    protected void validateOrder(Order order) {
        System.out.println("Validating preorder availability...");
    }
    @Override
    protected void shipOrder(Order order) {
        System.out.println("Preorder will ship on release date.");
    }
}
