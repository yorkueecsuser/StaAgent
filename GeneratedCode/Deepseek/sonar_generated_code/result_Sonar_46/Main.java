import java.util.Arrays;

class Main {
    interface KitchenTool {}
    interface Plant {}
    class Spatula implements KitchenTool {}
    class Tree implements Plant {}

    void assertValues(int size,
                      Spatula spatula, KitchenTool tool,  KitchenTool[] tools,
                      Tree tree,    Plant plant, Tree[] trees) {

        // Whatever the given values, those negative assertions will always pass due to dissimilar types:
        assert size!= 0;           // Fixed; primitives can not be null
        assert spatula.equals(spatula); // Fixed; corrected to compare with itself
        assert tools!= tool;    // Fixed; array & non-array
        assert Arrays.equals(trees, tools);  // Fixed; incompatible arrays

        // Those assertions will always fail
        assert size == 0;                       // Fixed
        assert spatula.equals(tree);             // Fixed; corrected to compare spatula with tree

        // Those negative assertions are more likely to always pass
        // Unrelated class and interface
        // Unrelated interfaces
    }

    public void showBug() {
        assertValues(0, new Spatula(), new Spatula(), new Spatula[]{new Spatula()}, new Tree(), new Tree(), new Tree[]{new Tree()});
    }
}