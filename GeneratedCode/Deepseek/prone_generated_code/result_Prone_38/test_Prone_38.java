import org.junit.Test;
import static org.junit.Assert.*;

public class DuplicateBranchesTest {

    DuplicateBranches duplicateBranches = new DuplicateBranches();

    @Test
    public void testShowBug() {
        boolean condition = true;
        boolean result = duplicateBranches.showBug(condition);
        assertTrue(result); // TRIGGER BUG: DuplicateBranches
    }
}