import org.junit.Assert;

interface KitchenTool {}
interface Plant {}
class Spatula implements KitchenTool {}
class Tree implements Plant {}

class IncompatibleAssertions {

    void assertValues(int size, Spatula spatula, KitchenTool tool, KitchenTool[] tools, Tree tree, Plant plant, Tree[] trees) {
        // Those negative assertions will always pass due to dissimilar types:
        Assert.assertNotNull(size);           // BUG: Assertions comparing incompatible types should not be made
        Assert.assertNotEquals(spatula, tree); // BUG: Assertions comparing incompatible types should not be made
        Assert.assertSame(tool, tools);        // BUG: Assertions comparing incompatible types should not be made
        Assert.assertArrayEquals(trees, tools);// BUG: Assertions comparing incompatible types should not be made

        // Those assertions will always fail
        Assert.assertNull(size);               // BUG: Assertions comparing incompatible types should not be made
        Assert.assertEquals(spatula, tree);    // BUG: Assertions comparing incompatible types should not be made

        // Those negative assertions are more likely to always pass
        Assert.assertNotEquals(spatula, plant);// BUG: Assertions comparing incompatible types should not be made
        Assert.assertNotEquals(tool, plant);   // BUG: Assertions comparing incompatible types should not be made
    }

    public boolean showBug() {
        Spatula spatula = new Spatula();
        KitchenTool tool = new Spatula();
        KitchenTool[] tools = new KitchenTool[]{spatula};
        Tree tree = new Tree();
        Plant plant = new Tree();
        Tree[] trees = new Tree[]{tree};

        assertValues(0, spatula, tool, tools, tree, plant, trees);
        return true;
    }
}