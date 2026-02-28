import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class DoubleBraceInitializationExampleTest {

    @Test
    public void testShowBug() {
        DoubleBraceInitializationExample example = new DoubleBraceInitializationExample();
        Map<String, String> result = example.showBug(); // TRIGGER BUG: Double Brace Initialization should not be used
        assertEquals("John", result.get("firstName"));
        assertEquals("Smith", result.get("lastName"));
        fail("This test is expected to fail due to the use of Double Brace Initialization"); // This line ensures the test fails
    }
}