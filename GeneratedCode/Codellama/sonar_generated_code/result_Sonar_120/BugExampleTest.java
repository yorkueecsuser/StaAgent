import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testCalculate() {
        String input = "123";
        int result = BugExample.calculate(input);
        assertEquals(123, result); // TRIGGER BUG: Return values from functions without side effects should not be ignored
    }
}