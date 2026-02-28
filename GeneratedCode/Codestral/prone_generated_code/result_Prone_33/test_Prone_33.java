import org.junit.Test;
import static org.junit.Assert.*;

public class DereferenceWithNullBranchBugTest {

    @Test
    public void testShowBugWithNullInput() {
        DereferenceWithNullBranchBug buggyObject = new DereferenceWithNullBranchBug(null);
        buggyObject.showBug(); // TRIGGER BUG: DereferenceWithNullBranch
    }
}