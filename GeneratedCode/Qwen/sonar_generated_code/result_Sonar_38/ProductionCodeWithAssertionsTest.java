import org.junit.Test;
import static org.junit.Assert.*;

public class ProductionCodeWithAssertionsTest {

    @Test
    public void testShowBugWithNegativeValue() {
        ProductionCodeWithAssertions example = new ProductionCodeWithAssertions();
        assertEquals(10, example.showBug(5)); // This should pass
        assertEquals(-10, example.showBug(-5)); // TRIGGER BUG: Assertions should not be used in production code
    }
}