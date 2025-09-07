package Village_Factory;

import Composite.CompositeComponent;

public interface VillageFactory {
    CompositeComponent createVillage(String name);
}
