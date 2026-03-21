import org.junit.Test;
import static org.junit.Assert.*;

public class IgnoringReturnValuesTest {

    @Test
    public void testShowBug() {
        IgnoringReturnValues instance = new IgnoringReturnValues();
        String command = "HELLO_WORLD";
        String expectedCommand = command.toLowerCase();
        instance.showBug(command);
        // TRIGGER BUG: Return values from functions without side effects should not be ignored
        assertNotEquals("The command should be in lower case, but it's not", expectedCommand, command);
    }
}