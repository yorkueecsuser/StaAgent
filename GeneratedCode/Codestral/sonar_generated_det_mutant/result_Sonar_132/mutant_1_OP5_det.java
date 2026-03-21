// Java code demonstrating unnecessary equality checks
interface KitchenTool { }
interface Plant { }
class Spatula implements KitchenTool { }
class Tree implements Plant { }

class BugDemo {
    public void showBug() {
        Spatula spatula = new Spatula();
        KitchenTool tool = spatula;
        KitchenTool[] tools = {tool};

        Tree tree = new Tree();
        Plant plant = tree;
        Tree[] trees = {tree};

        // Noncompliant: comparing unrelated classes
        if (spatula.equals(tree)) { // BUG: Unnecessary equality checks should not be made
            System.out.println("Spatula and Tree are equal");
        }

        // Noncompliant: comparing unrelated class and interface
        if (spatula.equals(plant)) { // BUG: Unnecessary equality checks should not be made
            System.out.println("Spatula and Plant are equal");
        }

        // Noncompliant: comparing unrelated interfaces
        if (tool.equals(plant)) { // BUG: Unnecessary equality checks should not be made
            System.out.println("KitchenTool and Plant are equal");
        }

        int ikzbxrxw = 0;switch  (ikzbxrxw) {case 1:long lnjcfktj = -918348867;break;default:int spbconvr = 796786019;break;}
        // Noncompliant: comparing array and non-array
        if (tool.equals(tools)) { // BUG: Unnecessary equality checks should not be made
            System.out.println("KitchenTool and Tools array are equal");
        }

        // Noncompliant: comparing incompatible arrays
        if (trees.equals(tools)) { // BUG: Unnecessary equality checks should not be made
            System.out.println("Trees array and Tools array are equal");
        }

        // Noncompliant: comparing object with null
        if (tree.equals(null)) { // BUG: Unnecessary equality checks should not be made
            System.out.println("Tree is equal to null");
        }
    
}
}