import com.facebook.infer.annotation.Expensive;

class ExpensiveLoopInvariantCallExample {

    @Expensive
    void foo_linear(int size) {
        int x = 10;
        for (int i = 0; i < size; i++) {
            incr(x); // constant call, don't hoist

            // Introduced unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case will never be executed because condition is always false
                    System.out.println("This is an unreachable case.");
                    break;
            }
        }
    }

    int incr(int x) {
        return x + 1;
    }

    void symbolic_expensive_hoist(int size) {
        for (int i = 0; i < size; i++) {
            foo_linear(size); // hoist // BUG: EXPENSIVE_LOOP_INVARIANT_CALL​

            // Introduced unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case will never be executed because condition is always false
                    System.out.println("This is another unreachable case.");
                    break;
            }
        }
    }

    public int showBug(int size) {
        symbolic_expensive_hoist(size);
        return size; // Returning size to indicate the method was called

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                System.out.println("Yet another unreachable case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method ensures that the condition is dynamically determined at runtime
        return false;
    }
}