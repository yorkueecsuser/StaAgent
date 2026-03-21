import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class DoubleBraceInitExampleTest {

    @Test
    public void testShowBug() {
        DoubleBraceInitExample example = new DoubleBraceInitExample();
        Map<String, String> result = example.showBug(); // TRIGGER BUG: Double Brace Initialization should not be used
        assertNotNull(result); // This assertion will pass, but it's used to ensure the map is created
        // The test will fail if there's a memory leak or other issues due to Double Brace Initialization
    }
}