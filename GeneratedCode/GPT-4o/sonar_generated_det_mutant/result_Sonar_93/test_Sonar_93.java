import org.junit.Test;
import static org.junit.Assert.*;

public class OperatorMisuseExampleTest {

    @Test
    public void testShowBug() {
        OperatorMisuseExample example = new OperatorMisuseExample();
        int result = example.showBug();  // TRIGGER BUG: Non-existent operators like "=+" should not be used
        assertEquals(-8, result);  // Expecting -8, but due to the bug, it will fail
    }
}