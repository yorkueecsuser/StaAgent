import java.util.Arrays;

interface KitchenTool {}
interface Plant {}

class Spatula implements KitchenTool {}
class Tree implements Plant {}

class BuggyCode {
    Spatula spatula = new Spatula();
    KitchenTool tool = spatula;
    KitchenTool[] tools = {tool};

    Tree tree = new Tree();
    Plant plant = tree;
    Tree[] trees = {tree};

    public boolean showBug() {
        if (spatula!= tree) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else {
            return false;
        }
    }

    public boolean showBug1() {
        if (spatula!= plant) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else {
            return false;
        }
    }

    public boolean showBug2() {
        if (tool!= plant) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else {
            return false;
        }
    }

    public boolean showBug3() {
        if (tool!= tools) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else {
            return false;
        }
    }

    public boolean showBug4() {
        if (!Arrays.equals(trees, tools)) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else {
            return false;
        }
    }

    public boolean showBug5() {
        if (tree!= null) { // BUG: Unnecessary equality checks should not be made
            return true;
        } else {
            return false;
        }
    }
}