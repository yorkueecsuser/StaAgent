import org.junit.Test;
import static org.junit.Assert.*;

public class DuplicateBranchesExampleTest {

    @Test
    public void testShowBugTrue() {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        assertEquals(42, example.showBug(true)); // TRIGGER BUG: DuplicateBranches
    }

    @Test
    public void testShowBugFalse() {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        assertEquals(42, example.showBug(false)); // TRIGGER BUG: DuplicateBranches
    }
}