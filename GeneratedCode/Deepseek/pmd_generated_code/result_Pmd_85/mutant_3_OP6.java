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
        
        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor == false; i++) {
            System.out.println("This loop is always false");
        }
        
        return bd;
    }
    
    // Helper method to get a Boolean condition
    private boolean getCondition() {
        return false;
    }
}