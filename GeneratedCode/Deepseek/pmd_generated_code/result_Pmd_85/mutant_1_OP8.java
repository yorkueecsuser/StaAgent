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
        BigDecimal mutant = new BigDecimal(5); // Mutant: Renaming bd to mutant
        bd = bd.add(mutant); // BUG: UselessOperationOnImmutable
        return bd;
    }
}