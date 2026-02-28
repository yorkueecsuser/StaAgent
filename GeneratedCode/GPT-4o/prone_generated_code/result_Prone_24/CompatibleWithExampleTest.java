import org.junit.Test;
import static org.junit.Assert.*;

public class CompatibleWithExampleTest {

    @Test
    public void testShowBugWithString() {
        CompatibleWithExample example = new CompatibleWithExample();
        assertTrue(example.showBug("Test String")); // TRIGGER BUG: CompatibleWithAnnotationMisuse
    }

    @Test
    public void testShowBugWithInteger() {
        CompatibleWithExample example = new CompatibleWithExample();
        assertFalse(example.showBug(123)); // TRIGGER BUG: CompatibleWithAnnotationMisuse
    }
}