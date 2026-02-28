import java.math.BigDecimal;

/**
 * This class is a demonstration of the UselessOperationOnImmutable bug with an added unreachable while loop.
 */
class UselessOperationOnImmutableBug {
    /**
     * This method demonstrates the bug with a mutant that adds an unreachable while loop.
     */
    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable
        // Mutant: Unreachable While Loop
        boolean conditionWhile = true;
        while (conditionWhile) {
            conditionWhile = false;
        }
        return bd;
    }
}