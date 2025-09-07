package Builder.Water_Source;

import Composite.CompositeComponent;
import Leaf.RectangleShape;

public class SwimmingPool implements WaterSourceBuilder {
        private CompositeComponent pool = new CompositeComponent("Swimming Pool");

        public SwimmingPool() {
            this.buildBase();
            this.buildWater();
            this.buildAccessories();
         }

        @Override
        public void buildBase() {
            pool.add(new RectangleShape("Pool Base", "Concrete", 6, 3));
        }

        @Override
        public void buildWater() {
            pool.add(new RectangleShape("Water", "Water", 5.8, 2.8));
        }

        @Override
        public void buildAccessories() {
            CompositeComponent accessories = new CompositeComponent("Pool Accessories");
            accessories.add(new RectangleShape("Ladder", "Metal", 0.5, 1.2));
            pool.add(accessories);
        }

        @Override
        public CompositeComponent getWaterSource() {
            return pool;
        }
    }