import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidUsingOctalValuesBugTest {
    @Test
    public void testShowBug() {
        AvoidUsingOctalValuesBug buggyObject = new AvoidUsingOctalValuesBug();
        int result = buggyObject.showBug();  // TRIGGER BUG: AvoidUsingOctalValues
        assertEquals(120, result);  // Test will fail because of the bug in showBug method
    }
}