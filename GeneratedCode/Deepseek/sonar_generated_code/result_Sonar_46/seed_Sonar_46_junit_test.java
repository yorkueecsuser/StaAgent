import org.junit.jupiter.api.Assertions;

class IncompatibleTypeBug {
    interface KitchenTool {}
    interface Plant {}
    class Spatula implements KitchenTool {}
    class Tree implements Plant {}

    public void showBug(Spatula spatula, KitchenTool tool, KitchenTool[] tools, Tree tree, Tree[] trees) {
        // BUG: Assertions comparing incompatible types should not be made
        Assertions.assertNotNull(spatula); // Noncompliant; comparing a primitive with null
        Assertions.assertNotEquals(spatula, tree); // Noncompliant; comparing an object with an unrelated primitive
        Assertions.assertNotSame(tool, tools); // Noncompliant; comparing an array to a non-array
        Assertions.assertArrayEquals(trees, tools); // Noncompliant; comparing two arrays of dissimilar types

        // These assertions will always pass
        Assertions.assertNull(tree); // Noncompliant
        Assertions.assertEquals(spatula, tool); // Noncompliant
    }
}