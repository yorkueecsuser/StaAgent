import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double x = 0.1;  // Renamed variable 'd' to 'x'
        BigDecimal bd = new BigDecimal(x);  // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return bd;
    }
}