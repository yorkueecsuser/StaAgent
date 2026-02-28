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

        // Mutation: Add an unreachable switch statement
        boolean unreachableCondition = false; // unreachableCondition is always false
        switch (1) { // The switch condition is compile-time constant
            case 1:
                unreachableCondition = true;
                break;
            default:
                break;
        }

        return bd;
    }
}