package Village_Factory;

import Builder.House.BrickHouse;
import Builder.House.HouseBuilder;
import Builder.Tree.MangoTree;
import Builder.Tree.TreeBuilder;
import Builder.Water_Source.SwimmingPool;
import Builder.Water_Source.WaterSourceBuilder;
import Composite.CompositeComponent;

public class ModernVillage implements VillageFactory {
    @Override
    public CompositeComponent createVillage(String name){
        CompositeComponent village = new CompositeComponent(name);

        HouseBuilder hb = new BrickHouse();
        CompositeComponent house = hb.getHouse();

        TreeBuilder tb = new MangoTree();
        CompositeComponent tree = tb.getTree();

        WaterSourceBuilder wb = new SwimmingPool();
        CompositeComponent water = wb.getWaterSource();
        
        village.add(house);
        village.add(tree);
        village.add(water);
        return village;
    }
}
