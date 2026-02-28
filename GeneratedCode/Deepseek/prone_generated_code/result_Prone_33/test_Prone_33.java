import org.junit.Test;
import static org.junit.Assert.*;

public class DereferenceWithNullBranchTest {
    @Test
    public void testShowBug() {
        try {
            DereferenceWithNullBranch.showBug();
            // If no exception is thrown, the test should fail
            fail("Expected an NullPointerException to be thrown"); // TRIGGER BUG: DereferenceWithNullBranch
        } catch (NullPointerException e) {
            // This is the expected behavior
        }
    }
}