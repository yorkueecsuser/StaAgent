import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComparisonExampleTest {

    @Test
    public void testShowBug() {
        SelfComparisonExample example = new SelfComparisonExample();

        // The bug occurs because we are comparing the value with itself.
        // This should trigger the bug as the comparison always results in 0.
        int result = example.showBug(10); // TRIGGER BUG: SelfComparison

        // Check if the result is as expected when the bug is present.
        // The test will fail because we expect a non-zero result from a meaningful comparison.
        assertNotEquals(0, result); // This assertion is expected to fail, triggering the bug.
    }
}