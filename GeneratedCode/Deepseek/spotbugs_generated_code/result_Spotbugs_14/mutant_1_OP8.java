import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double x = 0.1; // Mutant: Renamed 'd' to 'x'
        BigDecimal bd = new BigDecimal(x); // The bug still exists as BigDecimal is constructed from double 'x' which isn't represented precisely
        return bd;
    }
}