import com.facebook.infer.annotation.PerformanceCritical;

class InvariantCallExample {

    @PerformanceCritical
    int foo(int x, int y) {
        return x + y; // This function is pure and has no side effects
    }

    void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // hoistable // BUG: INVARIANT_CALL​
        }

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is intended to be unreachable
        }
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return size; // Return the size to demonstrate the method call
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but returns false
    }
}