// Java code to demonstrate the bug "Unnecessary equality checks should not be made"

interface KitchenTool {}
interface Plant {}

class Spatula implements KitchenTool {}
class Tree implements Plant {}

class BuggyEqualityChecks {
    public boolean showBug() {
        Spatula spatula = new Spatula();
        Tree tree = new Tree();
        KitchenTool tool = spatula;
        Plant plant = tree;
        KitchenTool[] tools = {tool};
        Tree[] trees = {tree};

        // BUG: Unnecessary equality checks should not be made
        if (spatula.equals(tree)) { // Noncompliant; unrelated classes
            return true;
        }
        else if (spatula.equals(plant)) { // Noncompliant; unrelated class and interface
            return true;
        }
        else if (tool.equals(plant)) { // Noncompliant; unrelated interfaces
            return true;
        }
        else if (tool.equals(tools)) { // Noncompliant; array & non-array
            return true;
        }
        else if (trees.equals(tools)) { // Noncompliant; incompatible arrays
            return true;
        }
        else if (tree.equals(null)) { // Noncompliant
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BuggyEqualityChecks buggyEqualityChecks = new BuggyEqualityChecks();
        System.out.println(buggyEqualityChecks.showBug());
    }
}