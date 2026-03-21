import java.math.BigDecimal;

class BigDecimalBug {
public BigDecimal showBug() {
    double d = 0.1;
    d = 0.1;
    BigDecimal bd = new BigDecimal(d);
    return bd;
}
}