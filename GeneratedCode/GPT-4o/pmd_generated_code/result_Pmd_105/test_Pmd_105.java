import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;
import java.math.BigDecimal;

public class BigNumberBugsTest {

    @Test
    public void testShowBigIntegerBug1() {
        BigNumberBugs bigNumberBugs = new BigNumberBugs();
        BigInteger expected = BigInteger.ONE;
        BigInteger actual = bigNumberBugs.showBigIntegerBug1(); // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(expected, actual);
    }

    @Test
    public void testShowBigIntegerBug2() {
        BigNumberBugs bigNumberBugs = new BigNumberBugs();
        BigInteger expected = BigInteger.ZERO;
        BigInteger actual = bigNumberBugs.showBigIntegerBug2(); // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(expected, actual);
    }

    @Test
    public void testShowBigDecimalBug1() {
        BigNumberBugs bigNumberBugs = new BigNumberBugs();
        BigDecimal expected = BigDecimal.ZERO;
        BigDecimal actual = bigNumberBugs.showBigDecimalBug1(); // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(expected, actual);
    }

    @Test
    public void testShowBigDecimalBug2() {
        BigNumberBugs bigNumberBugs = new BigNumberBugs();
        BigDecimal expected = BigDecimal.ZERO;
        BigDecimal actual = bigNumberBugs.showBigDecimalBug2(); // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(expected, actual);
    }

    @Test
    public void testShowBigDecimalBug3() {
        BigNumberBugs bigNumberBugs = new BigNumberBugs();
        BigDecimal expected = BigDecimal.TEN;
        BigDecimal actual = bigNumberBugs.showBigDecimalBug3(); // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(expected, actual);
    }
}