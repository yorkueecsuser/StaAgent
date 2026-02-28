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
        }
    }

    public void showBug(int size) {
        expensiveLoopInvariantCall(size);
        addUnreachableForLoop();
    }

    private void addUnreachableForLoop() {
        // Unreachable for loop with a condition that is always false at runtime
        boolean conditionFor = getFalseCondition();
        for (int j = 0; conditionFor; j++) {
            // This code block will never be executed
            System.out.println("Unreachable loop iteration: " + j);
        }
    }

    // Method to get a false condition to ensure the loop is unreachable
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ExpensiveLoopInvariantCallExample example = new ExpensiveLoopInvariantCallExample();
        example.showBug(10);
    }
}