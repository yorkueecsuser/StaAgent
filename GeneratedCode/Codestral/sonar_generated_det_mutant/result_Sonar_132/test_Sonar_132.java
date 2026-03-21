import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class BugDemoTest {
    @Test
    public void testUnnecessaryEqualityChecks() {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();

        Spatula spatula = new Spatula();
        KitchenTool tool = spatula;
        KitchenTool[] tools = {tool};

        Tree tree = new Tree();
        Plant plant = tree;
        Tree[] trees = {tree};

        // Add assertions to ensure the test case fails when reaching the bug
        assertNotEquals("Comparing unrelated classes", spatula, tree);
        assertNotEquals("Comparing unrelated class and interface", spatula, plant);
        assertNotEquals("Comparing unrelated interfaces", tool, plant);
        assertNotEquals("Comparing array and non-array", tool, tools);
        assertNotEquals("Comparing incompatible arrays", Arrays.hashCode(trees), Arrays.hashCode(tools));
        assertNotNull("Comparing object with null", tree);
    }
}