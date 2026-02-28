import org.junit.Test;
import static org.junit.Assert.*;

public class EqualityCheckBugTest {

    @Test
    public void testUnnecessaryEqualityChecks() {
        EqualityCheckBug bugDemo = new EqualityCheckBug();
        Spatula spatula = new Spatula();
        Tree tree = new Tree();
        KitchenTool tool = spatula;
        KitchenTool[] tools = {tool};
        Tree[] trees = {tree};
        Plant plant = tree;

        assertFalse(bugDemo.showBug(spatula, tree, tool, tools, trees, plant)); // TRIGGER BUG: Unnecessary equality checks should not be made
    }
}