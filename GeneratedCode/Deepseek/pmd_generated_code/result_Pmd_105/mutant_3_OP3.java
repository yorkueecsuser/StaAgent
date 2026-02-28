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

    public BigInteger showBug3() {
        BigInteger bi3;
        bi3 = new BigInteger("0");               // BUG: BigIntegerInstantiation
        return bi3;
    }

    public BigDecimal showBug4() {
        BigDecimal bd1 = new BigDecimal(0);      // BUG: BigIntegerInstantiation
        return bd1;
    }

    public BigDecimal showBug5() {
        BigDecimal bd2 = new BigDecimal("0.");   // BUG: BigIntegerInstantiation
        return bd2;
    }

    public BigDecimal showBug6() {
        BigDecimal bd3 = new BigDecimal(10);     // BUG: BigIntegerInstantiation
        return bd3;
    }
}

class Mutant {
    public BigInteger showBug1() {
        BigInteger bi1;
        if (false) {
            bi1 = new BigInteger("1");    // Mutant: Unreachable if statement
        } else {
            bi1 = new BigInteger("0");    // Mutant: Unreachable if statement
        }
        return bi1;
    }

    public BigInteger showBug2() {
        BigInteger bi2;
        if (false) {
            bi2 = new BigInteger("0");    // Mutant: Unreachable if statement
        } else {
            bi2 = new BigInteger("1");    // Mutant: Unreachable if statement
        }
        return bi2;
    }

    public BigInteger showBug3() {
        BigInteger bi3;
        if (false) {
            bi3 = new BigInteger("0");    // Mutant: Unreachable if statement
        } else {
            bi3 = new BigInteger("1");    // Mutant: Unreachable if statement
        }
        return bi3;
    }

    public BigDecimal showBug4() {
        BigDecimal bd1;
        if (false) {
            bd1 = new BigDecimal(0);      // Mutant: Unreachable if statement
        } else {
            bd1 = new BigDecimal(1);      // Mutant: Unreachable if statement
        }
        return bd1;
    }

    public BigDecimal showBug5() {
        BigDecimal bd2;
        if (false) {
            bd2 = new BigDecimal("0.");   // Mutant: Unreachable if statement
        } else {
            bd2 = new BigDecimal("1.");   // Mutant: Unreachable if statement
        }
        return bd2;
    }

    public BigDecimal showBug6() {
        BigDecimal bd3;
        if (false) {
            bd3 = new BigDecimal(10);     // Mutant: Unreachable if statement
        } else {
            bd3 = new BigDecimal(20);     // Mutant: Unreachable if statement
        }
        return bd3;
    }
}