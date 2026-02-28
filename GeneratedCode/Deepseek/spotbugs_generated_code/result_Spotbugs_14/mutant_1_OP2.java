import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // Original bug
        BigDecimal bd2 = new BigDecimal(d); // BUG: Duplicated assignment statement
        return bd;
    }
}