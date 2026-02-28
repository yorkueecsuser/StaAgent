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

        // Mutation: Unreachable While Loop
        while (false) {
            break; // The while loop is unreachable, but this break statement ensures that the loop is not infinite
        }

        return bd;
    }
}