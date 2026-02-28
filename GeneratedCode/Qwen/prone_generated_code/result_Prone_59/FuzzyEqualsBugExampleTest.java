import org.junit.Test;
import static org.junit.Assert.*;

public class FuzzyEqualsBugExampleTest {

    @Test
    public void testNonTransitivity() {
        FuzzyEqualsBugExample example1 = new FuzzyEqualsBugExample(0.1 + 0.2);
        FuzzyEqualsBugExample example2 = new FuzzyEqualsBugExample(0.3);
        FuzzyEqualsBugExample example3 = new FuzzyEqualsBugExample(0.301);

        assertTrue(example1.showBug(example2)); // TRIGGER BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
        assertTrue(example2.showBug(example3)); // TRIGGER BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
        assertFalse(example1.showBug(example3)); // TRIGGER BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    }
}