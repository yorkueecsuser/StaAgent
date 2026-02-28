import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedConditionalTestExampleTest {

    @Test
    public void testShowBug() {
        RepeatedConditionalTestExample example = new RepeatedConditionalTestExample();
        
        // Test where both conditions are true
        boolean result1 = example.showBug(0, 5);
        assertFalse("Expected false because the second condition should have been different.", result1); // TRIGGER BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)

        // Test where one condition is false
        boolean result2 = example.showBug(1, 0);
        assertFalse("Expected false because the second condition should have been different.", result2); // TRIGGER BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    }
}