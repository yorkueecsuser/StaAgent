import com.facebook.infer.annotation.Expensive;

class ExpensiveLoopInvariantCallExample {

    @Expensive
    void foo_linear(int size) {
        int x = 10;
        for (int i = 0; i < size; i++) {
            incr(x); // constant call, don't hoist
        }
    }

    int incr(int x) {
        return x + 1;
    }

    void symbolic_expensive_hoist(int size) {
        for (int i = 0; i < size; i++) {
            foo_linear(size); // hoist // BUG: EXPENSIVE_LOOP_INVARIANT_CALL​
        }
    }

    public int showBug(int size) {
        symbolic_expensive_hoist(size);
        return size; // Returning size to indicate the method was called
    }

    // Mutant code with variable renaming
    @Expensive
    void foo_linear_mutant(int a) {
        int y = 10;
        for (int b = 0; b < a; b++) {
            incr(y); // constant call, don't hoist
        }
    }

    int incr_mutant(int z) {
        return z + 1;
    }

    void symbolic_expensive_hoist_mutant(int c) {
        for (int d = 0; d < c; d++) {
            foo_linear_mutant(c); // hoist // BUG: EXPENSIVE_LOOP_INVARIANT_CALL​
        }
    }

    public int showBug_mutant(int e) {
        symbolic_expensive_hoist_mutant(e);
        return e; // Returning e to indicate the method was called
    }
}