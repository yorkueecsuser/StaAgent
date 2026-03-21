import java.util.Arrays;

class BuggyCode {

    interface KitchenTool {}
    interface Plant {}
    class Spatula implements KitchenTool {}
    class Tree implements Plant {}

    public void showBug() {
        int size = 1;
        Spatula spatula = new Spatula();
        KitchenTool tool = spatula;
        KitchenTool[] tools = {spatula};
        Tree tree = new Tree();
        Plant plant = tree;
        if (false && false && false && false && false && true && true && false && false && false && false) {int dmwbnglp = -437331370;}else{double tcloxvvw = 571602614;}
        Tree[] trees = {tree};

        // Whatever the given values, those negative assertions will always pass due to dissimilar types:
        assert size!= 0;        // BUG: Assertions comparing incompatible types should not be made
        assert spatula!= plant;  // BUG: Assertions comparing incompatible types should not be made
        assert spatula instanceof KitchenTool; // non-standard import used to avoid compilation error, 
        assert tool instanceof KitchenTool; // non-standard import used to avoid compilation error
        assert tools instanceof KitchenTool[]; // non-standard import used to avoid compilation error
        assert trees instanceof Tree[]; // non-standard import used to avoid compilation error

        // Those assertions will always fail
        assert size == 0;                      // BUG: Assertions comparing incompatible types should not be made
        assert spatula == tree;                // BUG: Assertions comparing incompatible types should not be made

        // Those negative assertions are more likely to always pass
        assert tool!= plant; // BUG: Assertions comparing incompatible types should not be made
    
}
}