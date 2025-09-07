package Leaf;

import Component.VillageComponent;

public abstract class Shape implements VillageComponent {
    protected String name;
    protected String material;
    protected double width = 0, height = 0, radius = 0;

    public Shape(String name, String material)
    {
        this.name = name;
        this.material = material;
    }

    @Override
        public void add(VillageComponent component) {
            throw new UnsupportedOperationException("Cannot add child to a leaf: " + name);
        }

    @Override
    public void remove(VillageComponent component) {
        throw new UnsupportedOperationException("Cannot remove child from a leaf: " + name);
    }
    @Override
    public VillageComponent getChild(int index) {
        throw new UnsupportedOperationException("Leaf has no children: " + name);
    }
    @Override
    public String getName() {
        return name;
    }
    protected String details() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(material == null ? "unknown" : material);
        if (width > 0 || height > 0) {
            sb.append(", w=").append(width).append(", h=").append(height);
        }
        if (radius > 0) {
            sb.append(", r=").append(radius);
        }
        sb.append(")");
        return sb.toString();
    }
    @Override
    public void display(String indent) {
        System.out.println(indent + "- " + name + " " + details());
    }
}
