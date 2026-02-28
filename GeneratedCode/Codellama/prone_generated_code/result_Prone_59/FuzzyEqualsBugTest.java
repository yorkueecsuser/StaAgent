import org.junit.Test;
import static org.junit.Assert.*;

class FuzzyEqualsBugTest {
    @Test
    public void testFuzzyEquals() {
        double[] values = {1.0, 2.0, 3.0, 4.0};
        double[] otherValues = {1.0, 2.0, 3.0, 4.0};

        assertFalse(Arrays.equals(values, otherValues, 0.00001)); // TRIGGER BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    }
}