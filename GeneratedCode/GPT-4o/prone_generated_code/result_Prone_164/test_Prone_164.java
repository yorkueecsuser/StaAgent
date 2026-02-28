import org.junit.Test;
import static org.junit.Assert.*;

public class TreeToStringExampleTest {

    @Test
    public void testShowBug() {
        TreeToStringExample example = new TreeToStringExample();
        TreeToStringExample.Tree tree = new TreeToStringExample.Tree("ExampleTree");
        
        // This test is expected to fail because the showBug method uses Tree#toString,
        // which will discard whitespace and comments, leading to incorrect string representation.
        String expected = "Tree: ExampleTree with whitespace and comments";
        String actual = example.showBug(tree); // TRIGGER BUG: TreeToString

        // This assertion will fail, triggering the bug.
        assertEquals(expected, actual); // TRIGGER BUG: TreeToString
    }
}