package Builder.House;

import Composite.CompositeComponent;
import Leaf.RectangleShape;
import Leaf.TriangleShape;

public class BrickHouse implements HouseBuilder {
        private CompositeComponent house = new CompositeComponent("Brick House");

        public BrickHouse() {
            this.buildWalls();
            this.buildRoof();
            this.buildDoor();
            this.buildWindows();
         }

        @Override
        public void buildWalls() {
            house.add(new RectangleShape("Walls", "Brick", 8, 6));
        }

        @Override
        public void buildRoof() {
            house.add(new TriangleShape("Roof", "Tiles", 8, 3));
        }

        @Override
        public void buildDoor() {
            house.add(new RectangleShape("Door", "Wood", 1.2, 2.2));
        }

        @Override
        public void buildWindows() {
            CompositeComponent windows = new CompositeComponent("Windows");
            windows.add(new RectangleShape("Window1", "Glass", 1.0, 1.0));
            windows.add(new RectangleShape("Window2", "Glass", 1.0, 1.0));
            house.add(windows);
        }

        @Override
        public CompositeComponent getHouse() {
            return house;
        }
    }