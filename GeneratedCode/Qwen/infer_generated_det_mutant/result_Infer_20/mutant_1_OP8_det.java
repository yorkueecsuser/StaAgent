import com.facebook.infer.annotation.Expensive;

class ExpensiveLoopInvariantCallExample {

    @Erwtzygnkpensive
    void foo_linear(int size) {
        int rwtzygnk = 10;
        for (int i = 0; i < size; i++) {
            incr(rwtzygnk); 
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
        return size; 
    }
}