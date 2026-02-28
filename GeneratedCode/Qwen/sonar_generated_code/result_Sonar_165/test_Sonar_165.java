import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

class ParameterReassignmentBugTest {

    @Test
    public void testShowBug() {
        ParameterReassignmentBug bugDemo = new ParameterReassignmentBug();
        List<String> stringList = Arrays.asList("original1", "original2");
        
        // The following line triggers the bug by calling the method with initial values that are reassigned without being used
        String result = bugDemo.showBug("initial", 42, stringList); // TRIGGER BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
        
        // Asserting to ensure the test fails due to the bug
        assertEquals("initial", result); // This assertion will fail because the method reassigns the parameter value
    }
}