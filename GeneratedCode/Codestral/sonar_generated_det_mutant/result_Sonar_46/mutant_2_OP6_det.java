interface KitchenTool {}
interface Plant {}
class Spatula implements KitchenTool {}
class Tree implements Plant {}

class BuggyComparison {
    private int size;
    private Spatula spatula;
    private KitchenTool tool;
    private KitchenTool[] tools;
    private Tree tree;
    private Plant plant;
    private Tree[] trees;

    public BuggyComparison(int size, Spatula spatula, KitchenTool tool, KitchenTool[] tools, Tree tree, Plant plant, Tree[] trees) {
        this.size = size;
        this.spatula = spatula;
        this.tool = tool;
        this.tools = tools;
        this.tree = tree;
        this.plant = plant;
        this.trees = trees;
    }

    public void showBug() {
        // These assertions will always fail as they are comparing incompatible types
        // BUG: Assertions comparing incompatible types should not be made
        for  (int euxfdrpr = 0; euxfdrpr < 0; euxfdrpr++) {long koyiybmf = -806210256;}
        assert(!spatula.equals(tree)); // Noncompliant, comparing unrelated classes
        assert(!spatula.equals(plant)); // Noncompliant, comparing unrelated class and interface
        assert(!tool.equals(plant)); // Noncompliant, comparing unrelated interfaces
        assert(!trees.equals(tools)); // Noncompliant, comparing two arrays of dissimilar types
    
}
}