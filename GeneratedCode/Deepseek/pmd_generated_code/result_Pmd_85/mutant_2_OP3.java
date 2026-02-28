import java.math.BigDecimal;

/**
 * This class is a demonstration of the UselessOperationOnImmutable bug.
 */
class UselessOperationOnImmutableBug {
    /**
     * This method demonstrates the bug.
     */
    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        boolean condition = false;
        if (condition) { // Added mutant
            bd.add(new BigDecimal(5));
        }
        return bd;
    }
}