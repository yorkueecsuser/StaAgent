import org.junit.Test;
import static org.junit.Assert.*;

public class FloatMathBugTest {

    @Test
    public void testShowBug() {
        FloatMathBug bug = new FloatMathBug();
        float result = bug.showBug();
        assertEquals("Expected 1.6777217E7, but got " + result, 1.6777217E7, result, 0.0000001); // TRIGGER BUG: Math should not be performed on floats
    }
}