import org.junit.Test;
import static org.junit.Assert.*;

public class FuzzyEqualsBugTest {

    @Test
    public void testFuzzyEqualsBug() {
        FuzzyEqualsBug a = new FuzzyEqualsBug(1.000000000000001);
        FuzzyEqualsBug b = new FuzzyEqualsBug(1.000000000000002);
        FuzzyEqualsBug c = new FuzzyEqualsBug(1.000000000000003);

        assertTrue(a.equals(b)); // TRIGGER BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
        assertTrue(b.equals(c)); // TRIGGER BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
        assertFalse(a.equals(c)); // TRIGGER BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    }
}