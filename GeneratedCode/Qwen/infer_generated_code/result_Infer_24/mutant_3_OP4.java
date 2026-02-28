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

            // Introduced unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block is reachable if shouldRun is true
                System.out.println("This block is reachable.");
            } else {
                // This block is unreachable if shouldRun is false
                System.out.println("This block is unreachable.");
            }
        }
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return size; // Return the size to demonstrate the method call
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, but it's not a compile-time constant
    }
}