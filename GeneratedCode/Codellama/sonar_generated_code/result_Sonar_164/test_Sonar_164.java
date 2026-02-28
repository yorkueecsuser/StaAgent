import org.junit.Test;
import static org.junit.Assert.*;

public class FloatingPointComparisonTest {
    @Test
    public void testBug() {
        float myNumber = 3.146f;
        // TRIGGER BUG: Floating point numbers should not be tested for equality
        assertTrue(myNumber!= 3.146f);
        
        // TRIGGER BUG: Indirect inequality test
        assertFalse(myNumber < 4 || myNumber > 4);
        
        float zeroFloat = 0.0f;
        // TRIGGER BUG: Floating point numbers should not be tested for equality
        assertFalse(zeroFloat == 0);
    }
}