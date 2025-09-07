import Composite.CompositeComponent;
import Village_Factory.FactoryProducer;
import Village_Factory.VillageFactory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Age of Villagers ===\n");

        // Client just asks FactoryProducer, no "new" anywhere!
        VillageFactory f1=FactoryProducer.getFactory("modern");
        VillageFactory f2=FactoryProducer.getFactory("traditional");

        CompositeComponent v1=f1.createVillage("Village A (Modern)");
        CompositeComponent v2=f2.createVillage("Village B (Traditional)");

        v1.display("");
        System.out.println();
        v2.display("");
    }
}

