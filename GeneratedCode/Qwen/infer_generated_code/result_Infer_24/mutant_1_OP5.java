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

            // Introduced unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case will never be executed because condition is always false
                    System.out.println("This is unreachable");
                    break;
                default:
                    // Default case to ensure switch is not empty
                    break;
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