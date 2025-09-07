package Builder.Tree;

import Composite.CompositeComponent;

public interface TreeBuilder {
    void buildTrunk();
    void buildCrown();
    void buildFruits();
    CompositeComponent getTree();
}