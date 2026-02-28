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
            
            // Unreachable switch statement mutation
            int unreachableSwitchVariable = getUnreachableSwitchVariable();
            switch (unreachableSwitchVariable) {
                case 99999: // This case will never be reached
                    System.out.println("This is unreachable code.");
                    break;
                default:
                    // Do nothing
                    break;
            }
        }
    }

    // Method to ensure the switch statement condition is dynamically determined
    public int getUnreachableSwitchVariable() {
        return -1; // Always returns a value that doesn't match the case
    }

    public void showBug(int size) {
        expensiveLoopInvariantCall(size);
    }

    public static void main(String[] args) {
        ExpensiveLoopInvariantCallExample example = new ExpensiveLoopInvariantCallExample();
        example.showBug(10);
    }
}