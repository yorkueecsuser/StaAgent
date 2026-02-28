import java.math.BigDecimal;
import java.math.BigInteger;

class BigIntegerInstantiation {
    public BigInteger showBug1() {
        BigInteger a = new BigInteger("1");    // Mutant: Renaming of BigIntegerInstantiation variable
        return a;
    }

    public BigInteger showBug2() {
        BigInteger b = new BigInteger("0");    // Mutant: Renaming of BigIntegerInstantiation variable
        return b;
    }

    public BigInteger showBug3() {
        BigInteger c;
        c = new BigInteger("0");               // Mutant: Renaming of BigIntegerInstantiation variable
        return c;
    }

    public BigDecimal showBug4() {
        BigDecimal d = new BigDecimal(0);      // Mutant: Renaming of BigIntegerInstantiation variable
        return d;
    }

    public BigDecimal showBug5() {
        BigDecimal e = new BigDecimal("0.");   // Mutant: Renaming of BigIntegerInstantiation variable
        return e;
    }

    public BigDecimal showBug6() {
        BigDecimal f = new BigDecimal(10);     // Mutant: Renaming of BigIntegerInstantiation variable
        return f;
    }
}