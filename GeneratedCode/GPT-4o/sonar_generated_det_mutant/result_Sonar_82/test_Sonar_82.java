import org.junit.Test;
import static org.junit.Assert.*;

public class RangeCheckExampleTest {

    @Test
    public void testShowBugWithNumberInRange() {
        RangeCheckExample example = new RangeCheckExample();
        
        int result = example.showBug(12); // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals(12, result); // This will fail because of the bug in the code
    }
    
    @Test
    public void testShowBugWithNumberBelowLowerBound() {
        RangeCheckExample example = new RangeCheckExample();
        
        int result = example.showBug(-5); // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals(0, result); // This will fail because of the bug in the code
    }

    @Test
    public void testShowBugWithNumberAboveUpperBound() {
        RangeCheckExample example = new RangeCheckExample();
        
        int result = example.showBug(25); // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals(20, result); // This will fail because of the bug in the code
    }
}