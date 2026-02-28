import com.facebook.infer.annotation.Expensive;

class ExpensiveLoopInvariantCallExample {

    @Expensive
    void foo_linear(int size) {
        int x = 10;
        int i = 0;
        do {
            incr(x); 
            i++;
        } while (i < size);
    }

    int incr(int x) {
        return x + 1;
    }

    void symbolic_expensive_hoist(int size) {
        int i = 0;
        do {
            foo_linear(size); // hoist // BUG: EXPENSIVE_LOOP_INVARIANT_CALL​
            i++;
        } while (i < size);
    }

    public int showBug(int size) {
        symbolic_expensive_hoist(size);
        return size; 
    }
}