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
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This code block will never be reached due to the unreachable if-else statement mutation.
        } else {
            System.out.println("This code will never be executed");
        }
        return bd;
    }

    // Helper method to ensure the condition is not a compile-time constant.
    public boolean getCondition() {
        return true;
    }
}