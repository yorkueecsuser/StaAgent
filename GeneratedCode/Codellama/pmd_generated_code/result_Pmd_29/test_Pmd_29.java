import org.junit.Test;
import static org.junit.Assert.*;

public class ComparisonWithNaNTest {
    @Test
    public void testBug() {
        ComparisonWithNaN comparisonWithNaN = new ComparisonWithNaN();
        comparisonWithNaN.showBug();

        // TRIGGER BUG: ComparisonWithNaN
        assertEquals(Double.NaN, comparisonWithNaN.getSomeDouble());
    }

    public double getSomeDouble() {
        return new Random().nextDouble();
    }
}