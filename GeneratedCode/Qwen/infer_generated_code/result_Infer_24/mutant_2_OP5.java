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
                    // This case is unreachable because condition is never true
                    System.out.println("This will never be printed");
                    break;
                case 1:
                    // This case is always executed
                    break;
            }
        }
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return size; // Return the size to demonstrate the method call
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement's first case unreachable
        return false;
    }
}