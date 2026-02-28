import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // Original bug

        // Added code with renamed variable
        double e = 0.2;
        BigDecimal ce = new BigDecimal(e); // New code with renamed variable

        return bd;
    }
}