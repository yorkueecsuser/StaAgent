import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class MainTest {

    @Test
    public void testShowBug() {
        BigDecimal bd = new BigDecimal(0.1); // TRIGGER BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        assertNotEquals(new BigDecimal("0.1"), bd);
    }
}