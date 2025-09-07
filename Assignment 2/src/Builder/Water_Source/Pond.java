package Builder.Water_Source;

import Composite.CompositeComponent;
import Leaf.CircleShape;
import Leaf.EllipseShape;

public class Pond implements WaterSourceBuilder {
        private CompositeComponent pond = new CompositeComponent("Pond");

        public Pond() {
            this.buildBase();
            this.buildWater();
            this.buildAccessories();
         }

        @Override
        public void buildBase() {
            pond.add(new EllipseShape("Pond Base", "Earth", 4.0, 2.5));
        }

        @Override
        public void buildWater() {
            pond.add(new EllipseShape("Water", "Water", 3.8, 2.3));
        }

        @Override
        public void buildAccessories() {
            CompositeComponent accessories = new CompositeComponent("Pond Accessories");
            accessories.add(new CircleShape("Lilypad", "Plant", 0.25));
            pond.add(accessories);
        }

        @Override
        public CompositeComponent getWaterSource() {
            return pond;
        }
    }
