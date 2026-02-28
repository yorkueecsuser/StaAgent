import org.junit.Test;
import static org.junit.Assert.*;

public class ProductionCodeTest {

    @Test
    public void testProcessDataWithNullInput() {
        ProductionCode productionCode = new ProductionCode();
        String input = null;
        // TRIGGER BUG: Assertions should not be used in production code
        productionCode.showBug(input);
    }
}