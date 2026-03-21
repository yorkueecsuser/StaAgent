import org.junit.Test;
import static org.junit.Assert.*;

public class ProductionCodeWithAssertionsTest {

    @Test
    public void testShowBugWithNegativeValue() {
        ProductionCodeWithAssertions productionCode = new ProductionCodeWithAssertions();
        assertEquals(10, productionCode.showBug(5)); // This should pass
        assertEquals(-10, productionCode.showBug(-5)); // TRIGGER BUG: Assertions should not be used in production code
    }
}