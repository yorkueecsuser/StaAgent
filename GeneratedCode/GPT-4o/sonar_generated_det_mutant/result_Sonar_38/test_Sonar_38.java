import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionInProductionTest {

    @Test
    public void testShowBugWithPositiveValue() {
        AssertionInProduction demo = new AssertionInProduction();
        int result = demo.showBug(5); // TRIGGER BUG: Assertions should not be used in production code
        assertEquals(10, result);
    }
    
    @Test
    public void testShowBugWithZeroValue() {
        AssertionInProduction demo = new AssertionInProduction();
        int result = demo.showBug(0); // TRIGGER BUG: Assertions should not be used in production code
    }
    
    @Test
    public void testShowBugWithNegativeValue() {
        AssertionInProduction demo = new AssertionInProduction();
        int result = demo.showBug(-1); // TRIGGER BUG: Assertions should not be used in production code
    }
}