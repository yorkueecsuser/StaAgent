import com.facebook.infer.annotation.*;

/**
 * Demonstrates an Expensive Loop Invariant Call bug.
 */
class ExpensiveLoopInvariantCallExample {

    @Expensive
    public void performExpensiveOperation(int size) {
        // Simulate an operation with linear complexity
        for (int i = 0; i < size; i++) {
            // Imagine some expensive logic here
        }
    }

    public void expensiveLoopInvariantCall(int size) {
        // The method call below is loop-invariant and expensive, thus should be hoisted out of the loop
        for (int i = 0; i < size; i++) {
            performExpensiveOperation(size); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
            
            // Added unreachable switch statement mutation
            int unreachableCondition = getUnreachableCondition();
            switch (unreachableCondition) {
                case 1:
                    System.out.println("This is unreachable.");
                    break;
                default:
                    // Do nothing
                    break;
            }
        }
    }

    public void showBug(int size) {
        expensiveLoopInvariantCall(size);
    }

    public static void main(String[] args) {
        ExpensiveLoopInvariantCallExample example = new ExpensiveLoopInvariantCallExample();
        example.showBug(10);
    }
    
    // Helper method to ensure the switch statement is unreachable
    private int getUnreachableCondition() {
        return 0; // Ensures the switch case '1' is never reached
    }
}