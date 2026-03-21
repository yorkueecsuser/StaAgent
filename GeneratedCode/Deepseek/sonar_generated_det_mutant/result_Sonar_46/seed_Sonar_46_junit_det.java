import org.junit.Assert;

class BuggyCode {
    interface KitchenTool {}
    interface Plant {}
    class Spatula implements KitchenTool {}
    class Tree implements Plant {}

    void assertValues(int size, Spatula spatula, KitchenTool tool, KitchenTool[] tools, Tree tree, Plant plant, Tree[] trees) {
        // Whatever the given values, those negative assertions will always pass due to dissimilar types:
        Assert.assertNotNull(size);           // Noncompliant; primitives can not be null
        Assert.assertNotEquals(spatula, tree); // Noncompliant; unrelated classes
        Assert.assertNotSame(tool, tools);    // Noncompliant; array & non-array
        Assert.assertArrayEquals(trees, tools);  // Noncompliant; incompatible arrays

        // Those assertions will always fail
        Assert.assertNull(size);                       // Noncompliant
        Assert.assertEquals(spatula, tree);             // Noncompliant

        // Those negative assertions are more likely to always pass
        Assert.assertNotEquals(spatula, plant); // Noncompliant; unrelated class and interface
        Assert.assertNotEquals(tool, plant);    // Noncompliant; unrelated interfaces
    }

    public void showBug(){
        int size = 10;
        Spatula spatula = new Spatula();
        Tree tree = new Tree();
        assertValues(size, spatula, spatula, new KitchenTool[1], tree, tree, new Tree[1]);
    }
}