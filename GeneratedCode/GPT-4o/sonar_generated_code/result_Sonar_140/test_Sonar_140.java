import org.junit.Test;
import static org.junit.Assert.*;

public class IncrementBugExampleTest {

    @Test
    public void testShowBugWithInitialValueZero() {
        IncrementBugExample example = new IncrementBugExample();
        
        assertEquals(1, example.showBug(0)); // TRIGGER BUG: Values should not be uselessly incremented
    }

    @Test
    public void testShowBugWithInitialValuePositive() {
        IncrementBugExample example = new IncrementBugExample();
        
        assertEquals(11, example.showBug(10)); // TRIGGER BUG: Values should not be uselessly incremented
    }

    @Test
    public void testShowBugWithInitialValueNegative() {
        IncrementBugExample example = new IncrementBugExample();
        
        assertEquals(-9, example.showBug(-10)); // TRIGGER BUG: Values should not be uselessly incremented
    }
}