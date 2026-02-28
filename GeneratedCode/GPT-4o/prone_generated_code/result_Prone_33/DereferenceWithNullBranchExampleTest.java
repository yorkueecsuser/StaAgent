import org.junit.Test;
import static org.junit.Assert.*;

public class DereferenceWithNullBranchExampleTest {

    @Test
    public void testShowBugWithNullInput() {
        DereferenceWithNullBranchExample example = new DereferenceWithNullBranchExample();
        assertNull(example.showBug(null)); // TRIGGER BUG: DereferenceWithNullBranch
    }
}