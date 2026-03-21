import org.junit.Test;
import static org.junit.Assert.*;

public class FloatMathBugTest {
    @Test
    public void testShowBug() {
        FloatMathBug bugDemo = new FloatMathBug();
        float result = bugDemo.showBug();

        // TRIGGER BUG: Math should not be performed on floats
        assertEquals(16777217.0f, result, 0.00001f);
    }
}