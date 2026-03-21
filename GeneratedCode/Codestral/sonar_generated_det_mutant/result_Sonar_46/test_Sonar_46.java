import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyComparisonTest {
    @Test
    public void testShowBug() {
        BuggyComparison buggyComparison = new BuggyComparison(5, new Spatula(), new Spatula(), new KitchenTool[]{new Spatula()}, new Tree(), new Tree(), new Tree[]{new Tree()});
        buggyComparison.showBug();
    }

    @Test(expected = AssertionError.class)
    public void testIncompatibleTypes() {
        BuggyComparison buggyComparison = new BuggyComparison(5, new Spatula(), new Spatula(), new KitchenTool[]{new Spatula()}, new Tree(), new Tree(), new Tree[]{new Tree()});
        buggyComparison.showBug();
    }
}