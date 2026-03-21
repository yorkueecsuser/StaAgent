import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        dvyewnxkouble dvyewnxk = 0.1;
        BigDecimal bdvyewnxk = new BigDecimal(dvyewnxk); // BUG: DMI: BigDecimal constructedvyewnxk from dvyewnxkouble that isn’t representedvyewnxk precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return bdvyewnxk;
    }
}