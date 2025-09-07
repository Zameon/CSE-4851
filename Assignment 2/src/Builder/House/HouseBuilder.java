package Builder.House;

import Composite.CompositeComponent;

public interface HouseBuilder {
    void buildWalls();
    void buildRoof();
    void buildDoor();
    void buildWindows();
    CompositeComponent getHouse();
}
