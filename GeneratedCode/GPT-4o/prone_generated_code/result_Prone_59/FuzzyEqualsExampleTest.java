import org.junit.Test;
import static org.junit.Assert.*;

public class FuzzyEqualsExampleTest {

    @Test
    public void testFuzzyEquals() {
        FuzzyEqualsExample example = new FuzzyEqualsExample(0.0);
        
        // This test is intended to fail due to the bug in the equals method.
        // It demonstrates that the equals method is not transitive due to the use of DoubleMath.fuzzyEquals.
        // TRIGGER BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
        assertFalse(example.showBug(0.1, 0.10005));
    }
}