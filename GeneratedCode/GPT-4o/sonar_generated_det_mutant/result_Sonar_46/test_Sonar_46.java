import org.junit.Test;
import static org.junit.Assert.*;

class AssertionTypeBugExampleTest {

    @Test
    public void testShowBug() {
        AssertionTypeBugExample example = new AssertionTypeBugExample();
        int size = 1;
        Spatula spatula = new Spatula();
        KitchenTool tool = new Spatula();
        KitchenTool[] tools = new KitchenTool[]{new Spatula()};
        Tree tree = new Tree();
        Plant plant = new Tree();
        Tree[] trees = new Tree[]{new Tree()};

        // The following lines will call the buggy method and are expected to trigger the bug
        example.showBug(size, spatula, tool, tools, tree, plant, trees); // TRIGGER BUG: Assertions comparing incompatible types should not be made
    }
}