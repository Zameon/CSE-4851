package factory;

import models.products.*;
import models.Product;

public class ProductFactory {
    public static Product createProduct(String type, String id, String name, double price)
    {
        if(type.equals("Book"))
        {
            return new Book(id, name, price);
        }
        else if(type.equals("Electronics"))
        {
            return new Electronics(id, name, price);
        }
        else 
        {
            throw new IllegalArgumentException("Unknown product type");
        }

    }
}
