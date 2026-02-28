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
        String uselessVariable = "useless"; // A dead store mutation has been added here
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable
        return bd;
    }
}