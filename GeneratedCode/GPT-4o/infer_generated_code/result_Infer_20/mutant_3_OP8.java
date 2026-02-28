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
    }

    public static void main(String[] args) {
        ExpensiveLoopInvariantCallExample example = new ExpensiveLoopInvariantCallExample();
        example.showBug(10);
    }
}

// Mutant Code
class ExpensiveLoopInvariantCallExampleMutant {

    @Expensive
    public void performExpensiveOperation(int x) {
        // Simulate an operation with linear complexity
        for (int i = 0; i < x; i++) {
            // Imagine some expensive logic here
        }
    }

    public void expensiveLoopInvariantCall(int x) {
        // The method call below is loop-invariant and expensive, thus should be hoisted out of the loop
        for (int i = 0; i < x; i++) {
            performExpensiveOperation(x); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
    }

    public void showBug(int x) {
        expensiveLoopInvariantCall(x);
    }

    public static void main(String[] args) {
        ExpensiveLoopInvariantCallExampleMutant example = new ExpensiveLoopInvariantCallExampleMutant();
        example.showBug(10);
    }
}