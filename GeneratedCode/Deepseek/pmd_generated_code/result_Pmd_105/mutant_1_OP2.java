import java.math.BigDecimal;
import java.math.BigInteger;

class BigIntegerInstantiation {
    public BigInteger showBug1() {
        BigInteger bi1 = new BigInteger("1");    // BUG: BigIntegerInstantiation
        return bi1;
    }

    public BigInteger showBug1dup() {
        BigInteger bi1dup = new BigInteger("1");    // Mutation: Duplication
        return bi1dup;
    }

    public BigInteger showBug2() {
        BigInteger bi2 = new BigInteger("0");    // BUG: BigIntegerInstantiation
        return bi2;
    }

    public BigInteger showBug2dup() {
        BigInteger bi2dup = new BigInteger("0");    // Mutation: Duplication
        return bi2dup;
    }

    public BigInteger showBug3() {
        BigInteger bi3;
        bi3 = new BigInteger("0");               // BUG: BigIntegerInstantiation
        return bi3;
    }

    public BigInteger showBug3dup() {
        BigInteger bi3dup;
        bi3dup = new BigInteger("0");               // Mutation: Duplication
        return bi3dup;
    }

    public BigDecimal showBug4() {
        BigDecimal bd1 = new BigDecimal(0);      // BUG: BigIntegerInstantiation
        return bd1;
    }

    public BigDecimal showBug4dup() {
        BigDecimal bd1dup = new BigDecimal(0);      // Mutation: Duplication
        return bd1dup;
    }

    public BigDecimal showBug5() {
        BigDecimal bd2 = new BigDecimal("0.");   // BUG: BigIntegerInstantiation
        return bd2;
    }

    public BigDecimal showBug5dup() {
        BigDecimal bd2dup = new BigDecimal("0.");   // Mutation: Duplication
        return bd2dup;
    }

    public BigDecimal showBug6() {
        BigDecimal bd3 = new BigDecimal(10);     // BUG: BigIntegerInstantiation
        return bd3;
    }

    public BigDecimal showBug6dup() {
        BigDecimal bd3dup = new BigDecimal(10);     // Mutation: Duplication
        return bd3dup;
    }
}