import org.junit.Test;
import static org.junit.Assert.*;

public class DeadParameterBugTest {
    @Test
    public void testShowBug() {
        DeadParameterBug buggyClass = new DeadParameterBug();
        int input = 5;
        // TRIGGER BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        int result = buggyClass.showBug(input);
        assertEquals("The buggy method should always return 10, irrespective of the input", 10, result);
    }
}