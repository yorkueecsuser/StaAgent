import org.junit.Test;
import static org.junit.Assert.fail;

public class BuggyConditionalStructureTest {

    @Test
    public void testShowBug() {
        BuggyConditionalStructure obj = new BuggyConditionalStructure();
        // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        obj.showBug(15, 2);
        // The test should fail here because no matter the value of a or i, the same method is called in all branches
    }
}