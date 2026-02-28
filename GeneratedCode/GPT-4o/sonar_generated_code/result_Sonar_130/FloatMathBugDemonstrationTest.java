import org.junit.Test;
import static org.junit.Assert.*;

public class FloatMathBugDemonstrationTest {

    @Test
    public void testShowBug() {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        float result = demo.showBug(); // TRIGGER BUG: Math should not be performed on floats
        assertEquals("Expected result is 1.6777217E7, but due to float precision issue it fails.", 1.6777217E7f, result, 0.0f);
    }

    @Test
    public void testShowBugWithDouble() {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        double result = demo.showBugWithDouble(); // TRIGGER BUG: Math should not be performed on floats
        assertEquals("Expected result is 1.6777217E7, but due to float precision issue it fails.", 1.6777217E7, result, 0.0);
    }
}