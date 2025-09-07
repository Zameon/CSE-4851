package Builder.Water_Source;

import Composite.CompositeComponent;

public interface WaterSourceBuilder {
    void buildBase();
    void buildWater();
    void buildAccessories();
    CompositeComponent getWaterSource();
}
