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

            // Inserting unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block should never execute
                System.out.println("This is an unreachable block");
            } else {
                // Alternative block that also should never execute due to the nature of the condition
                System.out.println("This is another unreachable block");
            }
        }
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return size; // Return the size to demonstrate the method call
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}