import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalNullExampleTest {

    @Test
    public void testShowBug() {
        OptionalNullExample example = new OptionalNullExample();
        String result = example.showBug(); // TRIGGER BUG: "null" should not be used with "Optional"
        assertEquals("Expected non-null value", "expectedValue", result);
    }
}