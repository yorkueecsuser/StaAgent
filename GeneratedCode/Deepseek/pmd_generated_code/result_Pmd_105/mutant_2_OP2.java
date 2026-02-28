import java.math.BigDecimal;
import java.math.BigInteger;

class BigIntegerInstantiation {
    public BigInteger showBug1() {
        BigInteger bi1 = new BigInteger("1");    // BUG: BigIntegerInstantiation
        BigInteger bi1_mutant = new BigInteger("1");    // Mutant: BigIntegerInstantiation
        return bi1;
    }

    public BigInteger showBug2() {
        BigInteger bi2 = new BigInteger("0");    // BUG: BigIntegerInstantiation
        BigInteger bi2_mutant = new BigInteger("0");    // Mutant: BigIntegerInstantiation
        return bi2;
    }

    public BigInteger showBug3() {
        BigInteger bi3;
        bi3 = new BigInteger("0");               // BUG: BigIntegerInstantiation
        BigInteger bi3_mutant = new BigInteger("0");               // Mutant: BigIntegerInstantiation
        return bi3;
    }

    public BigDecimal showBug4() {
        BigDecimal bd1 = new BigDecimal(0);      // BUG: BigIntegerInstantiation
        BigDecimal bd1_mutant = new BigDecimal(0);      // Mutant: BigIntegerInstantiation
        return bd1;
    }

    public BigDecimal showBug5() {
        BigDecimal bd2 = new BigDecimal("0.");   // BUG: BigIntegerInstantiation
        BigDecimal bd2_mutant = new BigDecimal("0.");   // Mutant: BigIntegerInstantiation
        return bd2;
    }

    public BigDecimal showBug6() {
        BigDecimal bd3 = new BigDecimal(10);     // BUG: BigIntegerInstantiation
        BigDecimal bd3_mutant = new BigDecimal(10);     // Mutant: BigIntegerInstantiation
        return bd3;
    }
}