package Leaf;

public class EllipseShape extends Shape {
    public EllipseShape(String name, String material, double minoraxis, double majoraxis)
    {
        super(name, material);
        this.width = majoraxis;
        this.height = minoraxis;
    }
}
