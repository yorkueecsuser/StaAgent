import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class BuggyBigDecimalTest {
    @Test
    public void testShowBug() {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        BigDecimal result = buggyBigDecimal.showBug();
        assertEquals(new BigDecimal("0.1"), result); // TRIGGER BUG: AvoidDecimalLiteralsInBigDecimalConstructor
    }
}