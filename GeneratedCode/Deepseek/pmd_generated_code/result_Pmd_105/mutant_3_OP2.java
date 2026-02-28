import java.math.BigDecimal;
import java.math.BigInteger;

class BigIntegerInstantiation {
    public BigInteger showBug1() {
        BigInteger bi1 = new BigInteger("1");    // BUG: BigIntegerInstantiation
        return bi1;
        BigInteger bi1 = new BigInteger("1");    // Mutant: Duplication Operator
    }

    public BigInteger showBug2() {
        BigInteger bi2 = new BigInteger("0");    // BUG: BigIntegerInstantiation
        return bi2;
        BigInteger bi2 = new BigInteger("0");    // Mutant: Duplication Operator
    }

    public BigInteger showBug3() {
        BigInteger bi3;
        bi3 = new BigInteger("0");               // BUG: BigIntegerInstantiation
        return bi3;
        bi3 = new BigInteger("0");               // Mutant: Duplication Operator
    }

    public BigDecimal showBug4() {
        BigDecimal bd1 = new BigDecimal(0);      // BUG: BigIntegerInstantiation
        return bd1;
        BigDecimal bd1 = new BigDecimal(0);      // Mutant: Duplication Operator
    }

    public BigDecimal showBug5() {
        BigDecimal bd2 = new BigDecimal("0.");   // BUG: BigIntegerInstantiation
        return bd2;
        BigDecimal bd2 = new BigDecimal("0.");   // Mutant: Duplication Operator
    }

    public BigDecimal showBug6() {
        BigDecimal bd3 = new BigDecimal(10);     // BUG: BigIntegerInstantiation
        return bd3;
        BigDecimal bd3 = new BigDecimal(10);     // Mutant: Duplication Operator
    }
}