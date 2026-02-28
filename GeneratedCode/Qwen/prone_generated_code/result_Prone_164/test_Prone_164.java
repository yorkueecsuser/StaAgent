import org.junit.Test;
import static org.junit.Assert.*;

public class TreeToStringExampleTest {

    @Test
    public void testShowBugWithTreeToString() {
        TreeToStringExample example = new TreeToStringExample();
        String result = example.showBug(new String[]{"element1", "element2"}); // TRIGGER BUG: TreeToString
        assertEquals("root: [child1, child2]", result); // This assertion will pass, but the bug is still triggered
        // To actually trigger the bug, we need to assert something that would fail due to the lack of whitespace and comments
        assertFalse(result.contains(" ")); // This assertion will fail, indicating the bug
    }
}