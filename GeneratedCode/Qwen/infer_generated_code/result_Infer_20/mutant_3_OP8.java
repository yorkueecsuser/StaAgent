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

    // Mutated code
    @Expensive
    void foo_linear(char b) {
        char y = 10;
        for (char j = 0; j < b; j++) {
            incr(y); // constant call, don't hoist
        }
    }

    char incr(char y) {
        return (char) (y + 1);
    }

    void symbolic_expensive_hoist(char b) {
        for (char j = 0; j < b; j++) {
            foo_linear(b); // hoist // BUG: EXPENSIVE_LOOP_INVARIANT_CALL​
        }
    }

    public char showBug(char b) {
        symbolic_expensive_hoist(b);
        return b; // Returning b to indicate the method was called
    }
}