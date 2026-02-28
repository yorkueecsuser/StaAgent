import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionDemoTest {

    @Test
    public void testShowBug() {
        AssertionDemo demo = new AssertionDemo();
        Spatula spatula = new Spatula();
        KitchenTool tool = spatula;
        KitchenTool[] tools = new KitchenTool[]{spatula};
        Tree tree = new Tree();
        Plant plant = tree;
        Tree[] trees = new Tree[]{tree};

        // The following assertions will trigger the bug due to incompatible type comparisons
        demo.showBug(1, spatula, tool, tools, tree, plant, trees); // TRIGGER BUG: Assertions comparing incompatible types should not be made
    }
}