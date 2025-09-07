package Builder.House;

import Composite.CompositeComponent;
import Leaf.RectangleShape;
import Leaf.TriangleShape;

public class MudHouse implements HouseBuilder {
        private CompositeComponent house = new CompositeComponent("Mud House");

        public MudHouse() {
            this.buildWalls();
            this.buildRoof();
            this.buildDoor();
            this.buildWindows();
         }

        @Override
        public void buildWalls() {
            house.add(new RectangleShape("Walls", "Mud", 7.5, 5.5));
        }

        @Override
        public void buildRoof() {
            house.add(new TriangleShape("Roof", "Thatch", 8, 2.5));
        }

        @Override
        public void buildDoor() {
            house.add(new RectangleShape("Door", "Bamboo", 1.0, 1.9));
        }

        @Override
        public void buildWindows() {
            CompositeComponent windows = new CompositeComponent("Windows");
            windows.add(new RectangleShape("Window1", "Lattice", 0.9, 0.9));
            house.add(windows);
        }

        @Override
        public CompositeComponent getHouse() {
            return house;
        }
    }