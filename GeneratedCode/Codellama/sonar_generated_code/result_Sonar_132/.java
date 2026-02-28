import java.util.Arrays;

class Spatula {
    //...
}

class Tree {
    //...
}

//...

Spatula spatula = new Spatula();
KitchenTool tool = spatula;
KitchenTool[] tools = { tool };

Tree tree = new Tree();
Plant plant = tree;
Tree[] trees = { tree };

if (spatula.equals(tree)) { // BUG: Unnecessary equality checks should not be made
    //...
} else if (spatula.equals(plant)) { // BUG: Unnecessary equality checks should not be made
    //...
} else if (tool.equals(plant)) { // BUG: Unnecessary equality checks should not be made
    //...
} else if (tool.equals(tools)) { // BUG: Unnecessary equality checks should not be made
    //...
} else if (trees.equals(tools)) { // BUG: Unnecessary equality checks should not be made
    //...
} else if (tree.equals(null)) { // BUG: Unnecessary equality checks should not be made
    //...
}