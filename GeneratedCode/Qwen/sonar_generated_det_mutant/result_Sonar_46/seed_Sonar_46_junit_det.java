import org.junit.Assert;

interface KitchenTool {}
interface Plant {}
class Spatula implements KitchenTool {}
class Tree implements Plant {}

class AssertionBugExample {

    void assertValues(int size, Spatula spatula, KitchenTool tool, KitchenTool[] tools, Tree tree, Plant plant, Tree[] trees) {
        // Whatever the given values, those negative assertions will always pass due to dissimilar types:
        Assert.assertNotNull(size);           // BUG: Assertions comparing incompatible types should not be made
        Assert.assertNotEquals(spatula, tree); // BUG: Assertions comparing incompatible types should not be made
        Assert.assertSame(tool, tools);        // BUG: Assertions comparing incompatible types should not be made
        Assert.assertArrayEquals(trees, tools);// BUG: Assertions comparing incompatible types should not be made

        // Those assertions will always fail
        Assert.assertNull(size);                       // BUG: Assertions comparing incompatible types should not be made
        Assert.assertEquals(spatula, tree);            // BUG: Assertions comparing incompatible types should not be made

        // Those negative assertions are more likely to always pass
        Assert.assertNotEquals(spatula, plant); // BUG: Assertions comparing incompatible types should not be made
        Assert.assertNotEquals(tool, plant);    // BUG: Assertions comparing incompatible types should not be made
    }

    public boolean showBug(int size, Spatula spatula, KitchenTool tool, KitchenTool[] tools, Tree tree, Plant plant, Tree[] trees) {
        assertValues(size, spatula, tool, tools, tree, plant, trees);
        return true;
    }

    public static void main(String[] args) {
        AssertionBugExample example = new AssertionBugExample();
        example.showBug(5, new Spatula(), new Spatula(), new KitchenTool[]{new Spatula()}, new Tree(), new Tree(), new Tree[]{new Tree()});
    }
}