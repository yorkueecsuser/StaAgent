class UnnecessaryEqualityCheckExample {

    interface KitchenTool {}
    interface Plant {}

    class Spatula implements KitchenTool {}
    class Tree implements Plant {}

    public boolean showBug() {
        Spatula spatula = new Spatula();
        KitchenTool tool = spatula;
        KitchenTool[] tools = {tool};

        Tree tree = new Tree();
        Plant plant = tree;
        Tree[] trees = {tree};

        if (spatula.equals(tree)) { // BUG: Unnecessary equality checks should not be made
            return true;
        }
        else if (spatula.equals(plant)) { // BUG: Unnecessary equality checks should not be made
            return true;
        }
        else if (tool.equals(plant)) { // BUG: Unnecessary equality checks should not be made
            return true;
        }
        else if (tool.equals(tools)) { // BUG: Unnecessary equality checks should not be made
            return true;
        }
        else if (trees.equals(tools)) { // BUG: Unnecessary equality checks should not be made
            return true;
        }
        else if (tree.equals(null)) { // BUG: Unnecessary equality checks should not be made
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        UnnecessaryEqualityCheckExample example = new UnnecessaryEqualityCheckExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}