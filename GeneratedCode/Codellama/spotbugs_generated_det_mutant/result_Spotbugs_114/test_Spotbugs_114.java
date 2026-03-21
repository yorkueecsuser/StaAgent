import org.junit.Test;
import static org.junit.Assert.*;

public class DoomedTestForEqualityToNaNTest {
    @Test
    public void testBug() {
        DoomedTestForEqualityToNaN doomedTestForEqualityToNaN = new DoomedTestForEqualityToNaN();
        doomedTestForEqualityToNaN.showBug();

        // TRIGGER BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
        double x = 0.0;
        assertFalse(Double.isNaN(x));
    }
}