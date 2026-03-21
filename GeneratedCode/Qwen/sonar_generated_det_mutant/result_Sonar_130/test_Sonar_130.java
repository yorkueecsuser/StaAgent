import org.junit.Test;
import static org.junit.Assert.*;

public class FloatMathBugTest {

    @Test
    public void testShowBug1() {
        FloatMathBug bugDemo = new FloatMathBug();
        float result = bugDemo.showBug1(); // TRIGGER BUG: Math should not be performed on floats
        assertEquals(16777217.0f, result, 0.0f); // This will fail due to precision loss
    }

    @Test
    public void testShowBug2() {
        FloatMathBug bugDemo = new FloatMathBug();
        double result = bugDemo.showBug2(); // TRIGGER BUG: Math should not be performed on floats
        assertEquals(16777217.0, result, 0.0); // This will fail due to precision loss
    }
}