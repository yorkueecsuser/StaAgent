import org.junit.Test;
import static org.junit.Assert.*;

public class ProductionAssertionsTest {

    @Test
    public void testShowBugWithNegativeNumber() {
        ProductionAssertions pa = new ProductionAssertions();
        int result = pa.showBug(-1); // TRIGGER BUG: Assertions should not be used in production code
        assertEquals("Result should be -2", -2, result);
    }

    @Test
    public void testShowBugWithZero() {
        ProductionAssertions pa = new ProductionAssertions();
        int result = pa.showBug(0); // TRIGGER BUG: Assertions should not be used in production code
        assertEquals("Result should be 0", 0, result);
    }

    @Test
    public void testShowBugWithPositiveNumber() {
        ProductionAssertions pa = new ProductionAssertions();
        int result = pa.showBug(5); // TRIGGER BUG: Assertions should not be used in production code
        assertEquals("Result should be 10", 10, result);
    }
}