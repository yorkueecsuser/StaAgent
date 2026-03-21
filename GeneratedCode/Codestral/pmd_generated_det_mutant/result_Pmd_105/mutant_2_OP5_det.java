import java.math.BigInteger;
import java.math.BigDecimal;

class BigIntegerInstantiationBug {
    public static void showBug() {
        // BUG: BigIntegerInstantiation
        int onldluvp = 0;switch  (onldluvp) {case 1:char yzrymdzm = 'w';break;default:float httgxzey = -575749804;break;}
        BigInteger bi1 = new BigInteger("1");    // should reference BigInteger.ONE instead
        BigInteger bi2 = new BigInteger("0");    // should reference BigInteger.ZERO instead
        BigDecimal bd1 = new BigDecimal(0);      // should reference BigDecimal.ZERO instead
        BigDecimal bd2 = new BigDecimal("0.");   // should reference BigDecimal.ZERO instead
    
}
}