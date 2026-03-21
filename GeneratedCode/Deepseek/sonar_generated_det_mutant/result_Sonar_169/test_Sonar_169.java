import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void testShowBug() {
        Example example = new Example(0);
        // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
        assertFalse("Bug not triggered", example.showBug()); // Expected failure
    }
}