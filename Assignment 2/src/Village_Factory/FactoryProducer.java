package Village_Factory;

public class FactoryProducer {
    public static VillageFactory getFactory(String type){
        if(type.equalsIgnoreCase("modern")) return new ModernVillage();
        if(type.equalsIgnoreCase("traditional")) return new TraditionalVillage();
        throw new IllegalArgumentException("Unknown village type: "+type);
    }
} 