import org.junit.jupiter.api.Assertions;

interface KitchenTool {}
interface Plant {}

class Spatula implements KitchenTool {}
class Tree implements Plant {}

class AssertionBugDemo {

    public void showBug(int size, Spatula spatula, KitchenTool tool, KitchenTool[] tools, Tree tree, Plant plant, Tree[] trees) {
        // Whatever the given values, those negative assertions will always pass due to dissimilar types:
        Assertions.assertNotNull(size);           // BUG: Assertions comparing incompatible types should not be made
        Assertions.assertNotEquals(spatula, tree); // BUG: Assertions comparing incompatible types should not be made
        Assertions.assertNotSame(tool, tools);     // BUG: Assertions comparing incompatible types should not be made
        Assertions.assertNotEquals(trees, tools);  // BUG: Assertions comparing incompatible types should not be made

        // Those assertions will always fail
        Assertions.assertNull(size);                       // BUG: Assertions comparing incompatible types should not be made
        Assertions.assertEquals(spatula, tree);            // BUG: Assertions comparing incompatible types should not be made

        // Those negative assertions are more likely to always pass
        Assertions.assertNotEquals(spatula, plant); // BUG: Assertions comparing incompatible types should not be made
        Assertions.assertNotEquals(tool, plant);    // BUG: Assertions comparing incompatible types should not be made
    }

    public static void main(String[] args) {
        // Demonstrating the bug
        Spatula spatula = new Spatula();
        KitchenTool tool = spatula;
        KitchenTool[] tools = { spatula };
        Tree tree = new Tree();
        Plant plant = tree;
        Tree[] trees = { tree };

        AssertionBugDemo demo = new AssertionBugDemo();
        demo.showBug(1, spatula, tool, tools, tree, plant, trees);
    }
}