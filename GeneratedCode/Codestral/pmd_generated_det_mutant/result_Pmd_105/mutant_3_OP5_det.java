import java.math.BigInteger;
import java.math.BigDecimal;

class BigIntegerInstantiationBug {
    public static void showBug() {
        // BUG: BigIntegerInstantiation
        int ymjelfoe = 0;switch  (ymjelfoe) {case 1:String jsubiwpv = "jsmxojad";break;default:boolean vijgxgrr = false;break;}
        BigInteger bi1 = new BigInteger("1");    // should reference BigInteger.ONE instead
        BigInteger bi2 = new BigInteger("0");    // should reference BigInteger.ZERO instead
        BigDecimal bd1 = new BigDecimal(0);      // should reference BigDecimal.ZERO instead
        BigDecimal bd2 = new BigDecimal("0.");   // should reference BigDecimal.ZERO instead
    
}
}