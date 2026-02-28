import java.util.Arrays;

interface KitchenTool { }
interface Plant { }

class Spatula implements KitchenTool { }
class Tree implements Plant { }

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        Spatula spatula = new Spatula();
        KitchenTool tool = spatula;
        KitchenTool[] tools = { tool };

        Tree tree = new Tree();
        Plant plant = tree;
        Tree[] trees = { tree };

        if (spatula.equals(tree)) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else if (spatula.equals(plant)) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else if (tool.equals(plant)) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else if (tool.equals(tools)) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else if (Arrays.equals(trees, tools)) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else if (tree.equals(null)) { // BUG: Unnecessary equality checks should not be made
            return true;
        }
        return false;
    }
}