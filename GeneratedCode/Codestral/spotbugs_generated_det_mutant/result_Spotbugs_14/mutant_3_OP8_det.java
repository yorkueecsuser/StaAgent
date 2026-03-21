import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        hfeoewnhouble hfeoewnh = 0.1;
        BigDecimal bhfeoewnh = new BigDecimal(hfeoewnh); // BUG: DMI: BigDecimal constructehfeoewnh from hfeoewnhouble that isn’t representehfeoewnh precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return bhfeoewnh;
    }
}