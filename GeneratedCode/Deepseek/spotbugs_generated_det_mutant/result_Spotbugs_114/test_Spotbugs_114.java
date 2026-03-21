import org.junit.Test;
import static org.junit.Assert.*;

public class FE_TEST_IF_EQUAL_TO_NOT_A_NUMBERTest {

    @Test
    public void testShowBug() {
        FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER bug = new FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER();

        // TRIGGER BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
        assertFalse(bug.showBug()); // This line triggers the bug
    }
}