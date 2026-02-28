import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;
import java.math.BigDecimal;

public class BigIntegerInstantiationBugTest {
    @Test
    public void testShowBug() {
        BigIntegerInstantiationBug.showBug();
        // TRIGGER BUG: BigIntegerInstantiation
        // The bug is triggered here because new instances of BigInteger and BigDecimal are created
        // with values that are already pre-defined by the Java standard library.
    }
}