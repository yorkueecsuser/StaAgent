import java.math.BigInteger;
import java.math.BigDecimal;

class BigIntegerInstantiationBug {

    public BigInteger showBug1() {
        BigInteger bi1 = new BigInteger("1"); // BUG: BigIntegerInstantiation
        return bi1;
    }

    public BigInteger showBug2() {
        BigInteger bi2 = new BigInteger("0"); // BUG: BigIntegerInstantiation
        return bi2;
    }

    public BigDecimal showBug3() {
        BigDecimal bd1 = new BigDecimal(0); // BUG: BigIntegerInstantiation
        return bd1;
    }

    public BigDecimal showBug4() {
        BigDecimal bd2 = new BigDecimal("0."); // BUG: BigIntegerInstantiation
        return bd2;
    }

    public BigDecimal showBug5() {
        BigDecimal bd3 = new BigDecimal(10); // BUG: BigIntegerInstantiation
        return bd3;
    }

    public static void main(String[] args) {
        BigIntegerInstantiationBug bugDemo = new BigIntegerInstantiationBug();
        System.out.println(bugDemo.showBug1());
        System.out.println(bugDemo.showBug2());
        System.out.println(bugDemo.showBug3());
        System.out.println(bugDemo.showBug4());
        System.out.println(bugDemo.showBug5());
    }
}