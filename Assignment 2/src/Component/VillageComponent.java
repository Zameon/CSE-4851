package Component;

public interface VillageComponent {
    void add(VillageComponent component);
    void remove(VillageComponent component);
    VillageComponent getChild(int index);
    void display(String indent);
    String getName();
    
} 