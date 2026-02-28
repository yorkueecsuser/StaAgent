import java.math.BigDecimal;
import java.math.BigInteger;

class BigIntegerInstantiation {
    public BigInteger showBug1() {
        BigInteger bi1 = new BigInteger("1");    // BUG: BigIntegerInstantiation
        return bi1;
    }

    public BigInteger showBug2() {
        BigInteger bi2 = new BigInteger("0");    // BUG: BigIntegerInstantiation
        return bi2;
    }

    public BigInteger r() {
        BigInteger r;
        r = new BigInteger("0");                  // BUG: RenameMutation
        return r;
    }

    public BigDecimal showBug4() {
        BigDecimal bd1 = new BigDecimal(0);      // BUG: BigIntegerInstantiation
        return bd1;
    }

    public BigDecimal showBug5() {
        BigDecimal bd2 = new BigDecimal("0.");   // BUG: BigIntegerInstantiation
        return bd2;
    }

    public BigDecimal s() {
        BigDecimal s;
        s = new BigDecimal(10);                    // BUG: RenameMutation
        return s;
    }
}