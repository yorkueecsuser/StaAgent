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

    // Mutated code with renaming of variable'size' to 'a'
    @Expensive
    void foo_linear_a(int a) {
        int x = 10;
        for (int i = 0; i < a; i++) {
            incr(x); // constant call, don't hoist
        }
    }

    void symbolic_expensive_hoist_a(int a) {
        for (int i = 0; i < a; i++) {
            foo_linear_a(a); // hoist // BUG: EXPENSIVE_LOOP_INVARIANT_CALL​
        }
    }

    public int showBug_a(int a) {
        symbolic_expensive_hoist_a(a);
        return a; // Returning a to indicate the method was called
    }
}