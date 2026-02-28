import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyExampleTest {

    @Test
    public void testToStringWhenEmpty() {
        BuggyExample example = new BuggyExample();
        assertNotNull(example.toString()); // TRIGGER BUG: "toString()" and "clone()" methods should not return null
    }

    @Test
    public void testCloneWhenEmpty() {
        BuggyExample example = new BuggyExample();
        assertNotNull(example.clone()); // TRIGGER BUG: "toString()" and "clone()" methods should not return null
    }

    @Test
    public void testShowBugMethod() {
        BuggyExample example = new BuggyExample();
        example.showBug(); // TRIGGER BUG: "toString()" and "clone()" methods should not return null
    }
}