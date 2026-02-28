import com.facebook.infer.annotation.Expensive;

class ExpensiveLoopInvariantCallExample {

    @Expensive
    void foo_linear(int size) {
        int x = 10;
        x = 10; // DUPLICATION: Duplicated assignment statement
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
        size = size; // DUPLICATION: Duplicated assignment statement
        return size; // Returning size to indicate the method was called
    }
}