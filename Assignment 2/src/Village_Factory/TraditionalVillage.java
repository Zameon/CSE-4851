package Village_Factory;

import Builder.House.HouseBuilder;
import Builder.House.MudHouse;
import Builder.Tree.BananaTree;
import Builder.Tree.TreeBuilder;
import Builder.Water_Source.Pond;
import Builder.Water_Source.WaterSourceBuilder;
import Composite.CompositeComponent;

public class TraditionalVillage implements VillageFactory {
    @Override
    public CompositeComponent createVillage(String name){
        CompositeComponent village = new CompositeComponent(name);

        HouseBuilder hb = new MudHouse();
        CompositeComponent house = hb.getHouse();

        TreeBuilder tb = new BananaTree();
        CompositeComponent tree = tb.getTree();

        WaterSourceBuilder wb = new Pond();
        CompositeComponent water = wb.getWaterSource();
        
        village.add(house);
        village.add(tree);
        village.add(water);
        return village;
    }
}
