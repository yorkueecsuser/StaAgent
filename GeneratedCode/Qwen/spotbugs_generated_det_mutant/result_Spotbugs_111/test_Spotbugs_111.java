import org.junit.Test;
import static org.junit.Assert.*;

public class ParameterOverwriteExampleTest {

    @Test
    public void testShowBug() {
        ParameterOverwriteExample example = new ParameterOverwriteExample();
        int result = example.showBug(10); // TRIGGER BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN) 
        assertEquals(10, result); // This assertion will fail because the method showBug overwrites the input parameter
    }
}