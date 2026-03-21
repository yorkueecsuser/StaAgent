import org.junit.Test;
import java.math.BigInteger;
import static org.junit.Assert.*;

public class BigIntegerBugTest {
    @Test
    public void testBigIntegerInstantiation() {
        // TRIGGER BUG: BigIntegerInstantiation
        BigInteger bigInt = new BigInteger("1234567890");
        assertEquals(BigInteger.valueOf(1234567890), bigInt);
    }

    @Test
    public void testShowBug() {
        // TRIGGER BUG: BigIntegerInstantiation
        BigInteger bigInt = BigIntegerBug.showBug();
        assertEquals(BigInteger.valueOf(1234567890), bigInt);
    }
}