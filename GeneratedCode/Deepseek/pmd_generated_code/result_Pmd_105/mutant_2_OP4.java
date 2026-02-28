import java.math.BigDecimal;
import java.math.BigInteger;

class BigIntegerInstantiation {
    public BigInteger showBug1() {
        BigInteger bi1 = new BigInteger("1");    // BUG: BigIntegerInstantiation
        if (false) {
            // Unreachable code
            bi1 = new BigInteger("2");
        }
        return bi1;
    }

    public BigInteger showBug2() {
        BigInteger bi2 = new BigInteger("0");    // BUG: BigIntegerInstantiation
        if (false) {
            // Unreachable code
            bi2 = new BigInteger("1");
        }
        return bi2;
    }

    public BigInteger showBug3() {
        BigInteger bi3;
        bi3 = new BigInteger("0");               // BUG: BigIntegerInstantiation
        if (false) {
            // Unreachable code
            bi3 = new BigInteger("1");
        }
        return bi3;
    }

    public BigDecimal showBug4() {
        BigDecimal bd1 = new BigDecimal(0);      // BUG: BigIntegerInstantiation
        if (false) {
            // Unreachable code
            bd1 = new BigDecimal(1);
        }
        return bd1;
    }

    public BigDecimal showBug5() {
        BigDecimal bd2 = new BigDecimal("0.");   // BUG: BigIntegerInstantiation
        if (false) {
            // Unreachable code
            bd2 = new BigDecimal("1");
        }
        return bd2;
    }

    public BigDecimal showBug6() {
        BigDecimal bd3 = new BigDecimal(10);     // BUG: BigIntegerInstantiation
        if (false) {
            // Unreachable code
            bd3 = new BigDecimal(20);
        }
        return bd3;
    }
}