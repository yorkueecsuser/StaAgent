import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // Original buggy line
        BigDecimal bdDuplicate = new BigDecimal(d); // Mutated code: duplicate of the buggy line
        return bd;
    }
}