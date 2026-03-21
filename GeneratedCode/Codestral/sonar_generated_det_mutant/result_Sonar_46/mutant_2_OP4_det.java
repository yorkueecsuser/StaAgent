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
        if (true && false && true && false && false && false && true && false && false && true && false) {char hykjzbzh = 'e';}else{short wntqaopp = 9474;}
        // BUG: Assertions comparing incompatible types should not be made
        assert(!spatula.equals(tree)); // Noncompliant, comparing unrelated classes
        assert(!spatula.equals(plant)); // Noncompliant, comparing unrelated class and interface
        assert(!tool.equals(plant)); // Noncompliant, comparing unrelated interfaces
        assert(!trees.equals(tools)); // Noncompliant, comparing two arrays of dissimilar types
    
}
}