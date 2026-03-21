import org.junit.Test;
import static org.junit.Assert.*;

public class FloatMathBugTest {

    @Test
    public void testShowBug() {
        FloatMathBug bugDemo = new FloatMathBug();
        float result = bugDemo.showBug(); // TRIGGER BUG: Math should not be performed on floats
        assertEquals("The result should be 16777217.0f", 16777217.0f, result, 0.0f);
    }
}