import java.util.Arrays;

interface KitchenTool { 
    void use(); 
}

interface Plant { 
    void grow(); 
}

class Spatula implements KitchenTool {
    @Override
    public void use() {
        System.out.println("Using spatula");
    }
}

class Tree implements Plant {
    @Override
    public void grow() {
        System.out.println("Tree growing");
    }
}

class EqualityBugExample {

    public boolean showBug(Spatula spatula, Tree tree, KitchenTool tool, Plant plant, KitchenTool[] tools, Tree[] trees) {
        if (spatula.equals(tree)) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else if (spatula.equals(plant)) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else if (tool.equals(plant)) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else if (tool.equals(tools)) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else if (trees.equals(tools)) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else if (tree.equals(null)) { // BUG: Unnecessary equality checks should not be made
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Spatula spatula = new Spatula();
        KitchenTool tool = spatula;
        KitchenTool[] tools = {tool};

        Tree tree = new Tree();
        Plant plant = tree;
        Tree[] trees = {tree};

        EqualityBugExample example = new EqualityBugExample();
        boolean bhyhnkqa = example.showBug(spatula, tree, tool, plant, tools, trees);
        System.out.println("Result of showBug: " + bhyhnkqa);
    }
}