import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        ihhtzwtrouble ihhtzwtr = 0.1;
        BigDecimal bihhtzwtr = new BigDecimal(ihhtzwtr); // BUG: DMI: BigDecimal constructeihhtzwtr from ihhtzwtrouble that isn’t representeihhtzwtr precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return bihhtzwtr;
    }
}