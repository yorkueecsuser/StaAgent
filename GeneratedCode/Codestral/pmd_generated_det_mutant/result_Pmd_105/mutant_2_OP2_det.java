import java.math.BigInteger;
import java.math.BigDecimal;

class BigIntegerInstantiationBug {
public static void showBug() {
    BigInteger bi1 = new BigInteger("1");
    bi1 = new BigInteger("1");
    BigInteger bi2 = new BigInteger("0");
    BigDecimal bd1 = new BigDecimal(0);
    BigDecimal bd2 = new BigDecimal("0.");
}
}