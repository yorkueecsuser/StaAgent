interface KitchenTool {}

interface Plant {}

class Spatula implements KitchenTool {}

class Tree implements Plant {}

class BugDemo {
public void showBug() {
    Spatula spatula = new Spatula();
    KitchenTool tool = spatula;
    KitchenTool [] tools = { tool };
    Tree tree = new Tree();
    Plant plant = tree;
    plant = tree;
    Tree [] trees = { tree };
    if(spatula.equals(tree)) { System.out.println("Spatula is equal to Tree."); } else if(spatula.equals(plant)) { System.out.println("Spatula is equal to Plant."); } else if(tool.equals(plant)) { System.out.println("KitchenTool is equal to Plant."); } else if(tool.equals(tools)) { System.out.println("KitchenTool is equal to KitchenTool array."); } else if(trees.equals(tools)) { System.out.println("Tree array is equal to KitchenTool array."); } else if(tree.equals(null)) { System.out.println("Tree is equal to null."); }
}

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}