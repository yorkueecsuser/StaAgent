import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

class ParameterReassignmentBugTest {

    @Test
    public void testShowBugMethodParameterReassignment() {
        ParameterReassignmentBug bugDemo = new ParameterReassignmentBug();
        List<String> strings = List.of("a", "b", "c");
        String result = bugDemo.showBug("initial", 42, strings); // TRIGGER BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
        assertEquals("initial", result); // This assertion will fail because the method reassigns the parameter without using its initial value
    }

    @Test
    public void testShowBugForeachVariableReassignment() {
        ParameterReassignmentBug bugDemo = new ParameterReassignmentBug();
        List<String> strings = List.of("a", "b", "c");
        bugDemo.showBug("initial", 42, strings); // TRIGGER BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
        assertEquals(List.of("a", "b", "c"), strings); // This assertion will fail because the foreach variable is reassigned without using its initial value
    }
}