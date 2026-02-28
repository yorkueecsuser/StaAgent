import com.facebook.infer.annotation.Expensive;

class ExpensiveLoopInvariantCallExample {

    @Expensive
    void foo_linear(int size) {
        int x = 10;
        for (int i = 0; i < size; i++) {
            incr(x); // constant call, don't hoist
        }
        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable branch");
        }
    }

    int incr(int x) {
        return x + 1;
    }

    void symbolic_expensive_hoist(int size) {
        for (int i = 0; i < size; i++) {
            foo_linear(size); // hoist // BUG: EXPENSIVE_LOOP_INVARIANT_CALL​
        }
        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is another unreachable branch");
        }
    }

    public int showBug(int size) {
        symbolic_expensive_hoist(size);
        return size; // Returning size to indicate the method was called
    }

    private boolean getCondition() {
        return false; // This method will always return false, but the compiler cannot determine this at compile time
    }
}