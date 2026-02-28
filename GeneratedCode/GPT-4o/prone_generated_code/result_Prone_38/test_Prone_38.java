import org.junit.Test;
import static org.junit.Assert.*;

public class DuplicateBranchesExampleTest {

    @Test
    public void testShowBugTrue() {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        String result = example.showBug(true);
        assertEquals("This branch is executed.", result);
    }

    @Test
    public void testShowBugFalse() {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        String result = example.showBug(false);
        assertEquals("Different branch is executed.", result); // TRIGGER BUG: DuplicateBranches
    }
}