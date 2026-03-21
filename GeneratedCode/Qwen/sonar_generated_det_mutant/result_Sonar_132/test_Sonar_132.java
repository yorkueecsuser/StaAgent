import org.junit.Test;
import static org.junit.Assert.*;

public class EqualityBugExampleTest {

    @Test
    public void testUnnecessaryEqualityChecks() {
        Spatula spatula = new Spatula();
        KitchenTool tool = spatula;
        KitchenTool[] tools = {tool};

        Tree tree = new Tree();
        Plant plant = tree;
        Tree[] trees = {tree};

        EqualityBugExample example = new EqualityBugExample();

        assertFalse(example.showBug(spatula, tree, tool, plant, tools, trees)); // TRIGGER BUG: Unnecessary equality checks should not be made
    }
}