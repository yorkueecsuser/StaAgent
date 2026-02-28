import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerInstantiationTest {
    BigIntegerInstantiation bigInstantiation = new BigIntegerInstantiation();

    @Test
    public void testShowBug1() {
        // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(BigInteger.ONE, bigInstantiation.showBug1());
    }

    @Test
    public void testShowBug2() {
        // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(BigInteger.ZERO, bigInstantiation.showBug2());
    }

    @Test
    public void testShowBug3() {
        // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(BigInteger.ZERO, bigInstantiation.showBug3());
    }

    @Test
    public void testShowBug4() {
        // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(BigDecimal.ZERO, bigInstantiation.showBug4());
    }

    @Test
    public void testShowBug5() {
        // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(BigDecimal.ZERO, bigInstantiation.showBug5());
    }

    @Test
    public void testShowBug6() {
        // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(BigDecimal.TEN, bigInstantiation.showBug6());
    }
}