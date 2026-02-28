import com.facebook.infer.annotation.Expensive;

class ExpensiveLoopInvariantCallExample {

    @Expensive
    void foo_linear(int size) {
        int x = 10;
        for (int i = 0; i < size; i++) {
            incr(x); // constant call, don't hoist
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // Some code that should never run
                System.out.println("This should never be printed");
            } else {
                // Alternative code that also should never run
                System.out.println("This should also never be printed");
            }
        }
    }

    int incr(int x) {
        return x + 1;
    }

    void symbolic_expensive_hoist(int size) {
        for (int i = 0; i < size; i++) {
            foo_linear(size); // hoist // BUG: EXPENSIVE_LOOP_INVARIANT_CALL​
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // Some code that should never run
                System.out.println("This should never be printed");
            } else {
                // Alternative code that also should never run
                System.out.println("This should also never be printed");
            }
        }
    }

    public int showBug(int size) {
        symbolic_expensive_hoist(size);
        return size; // Returning size to indicate the method was called
    }

    private boolean getCondition() {
        return false; // This method always returns false, ensuring the branches are unreachable
    }
}