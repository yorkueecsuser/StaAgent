import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;
import java.math.BigDecimal;

public class BigIntegerInstantiationBugTest {

    @Test
    public void testShowBug1() {
        BigIntegerInstantiationBug bugDemo = new BigIntegerInstantiationBug();
        BigInteger result = bugDemo.showBug1(); // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(BigInteger.ONE, result);
    }

    @Test
    public void testShowBug2() {
        BigIntegerInstantiationBug bugDemo = new BigIntegerInstantiationBug();
        BigInteger result = bugDemo.showBug2(); // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(BigInteger.ZERO, result);
    }

    @Test
    public void testShowBug3() {
        BigIntegerInstantiationBug bugDemo = new BigIntegerInstantiationBug();
        BigDecimal result = bugDemo.showBug3(); // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(BigDecimal.ZERO, result);
    }

    @Test
    public void testShowBug4() {
        BigIntegerInstantiationBug bugDemo = new BigIntegerInstantiationBug();
        BigDecimal result = bugDemo.showBug4(); // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(BigDecimal.ZERO, result);
    }

    @Test
    public void testShowBug5() {
        BigIntegerInstantiationBug bugDemo = new BigIntegerInstantiationBug();
        BigDecimal result = bugDemo.showBug5(); // TRIGGER BUG: BigIntegerInstantiation
        assertEquals(BigDecimal.TEN, result);
    }
}