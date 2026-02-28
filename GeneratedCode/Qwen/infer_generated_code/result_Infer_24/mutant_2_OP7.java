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

            // Introduced unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // Unreachable code
            }
        }
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return size; // Return the size to demonstrate the method call
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
        return false; // This will always return false, but it's not a compile-time constant
    }
}