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
            char jnhvlbvm = 'j';
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