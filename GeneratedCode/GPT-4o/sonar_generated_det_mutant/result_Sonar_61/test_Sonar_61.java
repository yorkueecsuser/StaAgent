import org.junit.Test;
import static org.junit.Assert.*;

public class EncapsulationIssueTest {

    @Test
    public void testShowBug() {
        EncapsulationIssue instance = new EncapsulationIssue();
        int inputValue = 10;
        int expectedValue = 10;

        // TRIGGER BUG: Getters and setters should access the expected fields
        int result = instance.showBug(inputValue);

        // This assertion will fail due to the bug
        assertEquals(expectedValue, result);
    }
}