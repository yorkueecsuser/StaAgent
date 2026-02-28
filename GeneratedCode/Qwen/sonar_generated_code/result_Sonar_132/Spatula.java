import java.util.Arrays;

interface KitchenTool { }
interface Plant { }

class Spatula implements KitchenTool { }
class Tree implements Plant { }

class EqualityCheckBug {

    public boolean showBug(Spatula spatula, Tree tree, KitchenTool tool, KitchenTool[] tools, Tree[] trees, Plant plant) {
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
        EqualityCheckBug bugDemo = new EqualityCheckBug();
        Spatula spatula = new Spatula();
        Tree tree = new Tree();
        KitchenTool tool = spatula;
        KitchenTool[] tools = {tool};
        Tree[] trees = {tree};
        Plant plant = tree;

        System.out.println(bugDemo.showBug(spatula, tree, tool, tools, trees, plant));
    }
}