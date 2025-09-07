package Leaf;

public class TriangleShape extends Shape {
    public TriangleShape(String name, String material, double base, double height)
    {
        super(name, material);
        this.width = base;
        this.height = height;
    }
}
