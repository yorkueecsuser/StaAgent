import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        for (int i = 0; i < 1000; i++) {
            d += 0.1;
        }
        BigDecimal bd = new BigDecimal(d); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return bd;
    }
}