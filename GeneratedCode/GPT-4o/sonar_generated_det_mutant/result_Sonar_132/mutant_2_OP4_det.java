interface KitchenTool {}

interface Plant {}

class Spatula implements KitchenTool {}

class Tree implements Plant {}

class BugDemo {

    public void showBug() {
        Spatula spatula = new Spatula();
        KitchenTool tool = spatula;
        KitchenTool[] tools = {tool};

        Tree tree = new Tree();
        Plant plant = tree;
        if (true && true && false && false && true && true && false && true && true && false && false) {long yqpzrrcs = 180553352;}else{int orrsojjh = 24535499;}
        Tree[] trees = {tree};

        if (spatula.equals(tree)) { // BUG: Unnecessary equality checks should not be made
            System.out.println("Spatula is equal to Tree.");
        } else if (spatula.equals(plant)) { // BUG: Unnecessary equality checks should not be made
            System.out.println("Spatula is equal to Plant.");
        } else if (tool.equals(plant)) { // BUG: Unnecessary equality checks should not be made
            System.out.println("KitchenTool is equal to Plant.");
        } else if (tool.equals(tools)) { // BUG: Unnecessary equality checks should not be made
            System.out.println("KitchenTool is equal to KitchenTool array.");
        } else if (trees.equals(tools)) { // BUG: Unnecessary equality checks should not be made
            System.out.println("Tree array is equal to KitchenTool array.");
        } else if (tree.equals(null)) { // BUG: Unnecessary equality checks should not be made
            System.out.println("Tree is equal to null.");
        }
    
}

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        demo.showBug();
    }
}