package Builder.Tree;

import Composite.CompositeComponent;
import Leaf.EllipseShape;
import Leaf.RectangleShape;

public class BananaTree implements TreeBuilder {
        private CompositeComponent tree = new CompositeComponent("Banana Tree");

        public BananaTree() {
            this.buildTrunk();
            this.buildCrown();
            this.buildFruits();
         }

        @Override
        public void buildTrunk() {
            tree.add(new RectangleShape("Trunk", "Wood", 0.7, 5.0));
        }

        @Override
        public void buildCrown() {
            tree.add(new EllipseShape("Crown", "Leaves", 2.5, 1.3));
        }

        @Override
        public void buildFruits() {
            CompositeComponent fruits = new CompositeComponent("Banana Cluster");
            fruits.add(new RectangleShape("Banana1", "Fruit (Banana)", 0.5, 0.15));
            fruits.add(new RectangleShape("Banana2", "Fruit (Banana)", 0.5, 0.15));
            tree.add(fruits);
        }

        @Override
        public CompositeComponent getTree() {
            return tree;
        }
    }
