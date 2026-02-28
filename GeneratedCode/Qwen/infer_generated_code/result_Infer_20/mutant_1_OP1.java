import com.facebook.infer.annotation.Expensive;

class ExpensiveLoopInvariantCallExample {

    @Expensive
    void foo_linear(int size) {
        int x = 10;
        for (int i = 0; i < size; i++) {
            incr(x); // constant call, don't hoist
        }
        // Dead Store Mutation
        int abcdefgh = 42; // Unused variable declaration
    }

    int incr(int x) {
        return x + 1;
    }

    void symbolic_expensive_hoist(int size) {
        for (int i = 0; i < size; i++) {
            foo_linear(size); // hoist // BUG: EXPENSIVE_LOOP_INVARIANT_CALL​
        }
        // Dead Store Mutation
        String ijklmnop = "unused"; // Unused variable declaration
    }

    public int showBug(int size) {
        symbolic_expensive_hoist(size);
        return size; // Returning size to indicate the method was called
        // Dead Store Mutation
        double qrstuvwx = 3.14; // Unused variable declaration
    }
}