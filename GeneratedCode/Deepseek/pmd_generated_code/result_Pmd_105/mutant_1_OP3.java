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
    
    public void showMutant1() {
        boolean condition = false;
        if (condition) {
            BigInteger bi = new BigInteger("0");
        }
    }

    public void showMutant2() {
        boolean condition = false;
        while (condition) {
            BigDecimal bd = new BigDecimal("0");
        }
    }

    public void showMutant3() {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            BigDecimal bd = new BigDecimal("0");
        }
    }

    public void showMutant4() {
        boolean condition = false;
        if (condition) {
            BigDecimal bd = new BigDecimal("0");
        } else {
            BigDecimal bd = new BigDecimal("0");
        }
    }

    public void showMutant5() {
        int value = 0;
        switch(value) {
            case 0:
                BigInteger bi = new BigInteger("0");
                break;
        }
    }
}