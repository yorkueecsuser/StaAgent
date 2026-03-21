import org.junit.Test;
import static org.junit.Assert.*;

public class OverridableMethodCallInCloneTest {
    @Test
    public void testShowBug() throws Exception {
        // Given
        OverridableMethodCallInClone obj = new OverridableMethodCallInClone("Original Data");

        // When
        Object cloneObj = obj.showBug(); // This line triggers the bug

        // Then
        // We expect the clone object to have the data "Modified Data", but it has "Original Data" because the mutateData method is called in the clone method, which is overridden and behaves differently in the clone.
        // Therefore, the test should fail.
        // TRIGGER BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
        assertEquals("Original Data", ((OverridableMethodCallInClone) cloneObj).showBug());
    }
}