package Composite;
import java.util.ArrayList;
import java.util.List;

import Component.VillageComponent;

public class CompositeComponent implements VillageComponent {
    private String name;
    private List<VillageComponent> children = new ArrayList<>();

    public CompositeComponent(String name) {
            this.name = name;
        }

        @Override
        public void add(VillageComponent component) {
            children.add(component);
        }

        @Override
        public void remove(VillageComponent component) {
            children.remove(component);
        }

        @Override
        public VillageComponent getChild(int index) {
            return children.get(index);
        }

        @Override
        public void display(String indent) {
            System.out.println(indent + "+ " + name);
            String childIndent = indent + "   ";
            for (VillageComponent c : children) {
                c.display(childIndent);
            }
        }

        @Override
        public String getName() {
            return name;
        }

        public int childCount() {
            return children.size();
        }
}
