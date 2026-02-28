import com.facebook.infer.annotation.Expensive;

class ExpensiveLoopInvariantCallExample {

    @Expensive
    void foo_linear(int size) {
        int x = 10;
        for (int i = 0; i < size; i++) {
            incr(x); // constant call, don't hoist
        }

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is dynamically determined and set to false
        }
    }

    int incr(int x) {
        return x + 1;
    }

    void symbolic_expensive_hoist(int size) {
        for (int i = 0; i < size; i++) {
            foo_linear(size); // hoist // BUG: EXPENSIVE_LOOP_INVARIANT_CALL​
        }

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is dynamically determined and set to false
        }
    }

    public int showBug(int size) {
        symbolic_expensive_hoist(size);
        return size; // Returning size to indicate the method was called
    }

    // Method to provide a dynamic condition that evaluates to false
    private boolean getCondition() {
        return false;
    }
}