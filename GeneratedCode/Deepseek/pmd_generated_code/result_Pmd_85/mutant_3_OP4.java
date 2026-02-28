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
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable

        boolean shouldRun = false;
        if (shouldRun) {
            // Unreachable if-else statement
            if (false) {
                bd = new BigDecimal(0);
            } else {
                bd = new BigDecimal(1);
            }
        }

        return bd;
    }
}