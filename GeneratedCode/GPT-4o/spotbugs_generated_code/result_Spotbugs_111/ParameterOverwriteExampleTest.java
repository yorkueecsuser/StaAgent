import org.junit.Test;
import static org.junit.Assert.*;

public class ParameterOverwriteExampleTest {

    @Test
    public void testShowBug() {
        ParameterOverwriteExample example = new ParameterOverwriteExample();
        int input = 10;
        int result = example.showBug(input); // TRIGGER BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        assertEquals(42, result); // TRIGGER BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
    }
}