// Java code demonstrating unnecessary equality checks
interface KitchenTool { }
interface Plant { }
class Spatula implements KitchenTool { }
class Tree implements Plant { }

class BugDemo {
public void showBug() {
    Spatula spatula = new Spatula();
    spatula = new Spatula();
    KitchenTool tool = spatula;
    KitchenTool [] tools = { tool };
    Tree tree = new Tree();
    Plant plant = tree;
    Tree [] trees = { tree };
    if(spatula.equals(tree)) { System.out.println("Spatula and Tree are equal"); }
    if(spatula.equals(plant)) { System.out.println("Spatula and Plant are equal"); }
    if(tool.equals(plant)) { System.out.println("KitchenTool and Plant are equal"); }
    if(tool.equals(tools)) { System.out.println("KitchenTool and Tools array are equal"); }
    if(trees.equals(tools)) { System.out.println("Trees array and Tools array are equal"); }
    if(tree.equals(null)) { System.out.println("Tree is equal to null"); }
}
}