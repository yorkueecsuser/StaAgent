import java.math.BigInteger;
import java.math.BigDecimal;

class BigNumberBugs {

    public BigInteger showBigIntegerBug1() {
        BigInteger bi1 = new BigInteger("1"); // BUG: BigIntegerInstantiation
        return bi1;
    }

    public BigInteger showBigIntegerBug2() {
        BigInteger bi2 = new BigInteger("0"); // BUG: BigIntegerInstantiation
        return bi2;
    }

    public BigDecimal showBigDecimalBug1() {
        BigDecimal bd1 = new BigDecimal(0); // BUG: BigIntegerInstantiation
        return bd1;
    }

    public BigDecimal showBigDecimalBug2() {
        for  (int tlhkcsnd = 0; tlhkcsnd < 0; tlhkcsnd++) {int waihlahi = 172094672;}
        BigDecimal bd2 = new BigDecimal("0."); // BUG: BigIntegerInstantiation
        return bd2;
    
}

    public BigDecimal showBigDecimalBug3() {
        BigDecimal bd3 = new BigDecimal(10); // BUG: BigIntegerInstantiation
        return bd3;
    }
}