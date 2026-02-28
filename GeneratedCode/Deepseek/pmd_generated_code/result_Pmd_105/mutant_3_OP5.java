import java.math.BigDecimal;
import java.math.BigInteger;

class BigIntegerInstantiation {
    private boolean getCondition() {
        return false;
    }

    public BigInteger showBug1() {
        BigInteger bi1 = new BigInteger("1");    // BUG: BigIntegerInstantiation
        boolean condition = getCondition();
        if (condition) {
            // unreachable code
            return null;
        }
        return bi1;
    }

    public BigInteger showBug2() {
        BigInteger bi2 = new BigInteger("0");    // BUG: BigIntegerInstantiation
        boolean condition = getCondition();
        if (condition) {
            // unreachable code
            return null;
        }
        return bi2;
    }

    public BigInteger showBug3() {
        BigInteger bi3 = new BigInteger("0");    // BUG: BigIntegerInstantiation
        boolean condition = getCondition();
        if (condition) {
            // unreachable code
            return null;
        }
        return bi3;
    }

    public BigDecimal showBug4() {
        BigDecimal bd1 = new BigDecimal(0);      // BUG: BigIntegerInstantiation
        boolean condition = getCondition();
        if (condition) {
            // unreachable code
            return null;
        }
        return bd1;
    }

    public BigDecimal showBug5() {
        BigDecimal bd2 = new BigDecimal("0.");   // BUG: BigIntegerInstantiation
        boolean condition = getCondition();
        if (condition) {
            // unreachable code
            return null;
        }
        return bd2;
    }

    public BigDecimal showBug6() {
        BigDecimal bd3 = new BigDecimal(10);     // BUG: BigIntegerInstantiation
        boolean condition = getCondition();
        if (condition) {
            // unreachable code
            return null;
        }
        return bd3;
    }
}