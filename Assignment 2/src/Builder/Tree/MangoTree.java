package Builder.Tree;

import Composite.CompositeComponent;
import Leaf.CircleShape;
import Leaf.RectangleShape;

public class MangoTree implements TreeBuilder {
        private CompositeComponent tree = new CompositeComponent("Mango Tree");

        public MangoTree() {
            this.buildTrunk();
            this.buildCrown();
            this.buildFruits();
         }

        @Override
        public void buildTrunk() {
            tree.add(new RectangleShape("Trunk", "Wood", 0.8, 4.0));
        }

        @Override
        public void buildCrown() {
            tree.add(new CircleShape("Crown", "Leaves", 2.8));
        }

        @Override
        public void buildFruits() {
            CompositeComponent fruits = new CompositeComponent("Mangoes");
            fruits.add(new CircleShape("Mango1", "Fruit (Mango)", 0.2));
            fruits.add(new CircleShape("Mango2", "Fruit (Mango)", 0.2));
            fruits.add(new CircleShape("Mango3", "Fruit (Mango)", 0.2));
            tree.add(fruits);
        }

        @Override
        public CompositeComponent getTree() {
            return tree;
        }
    }