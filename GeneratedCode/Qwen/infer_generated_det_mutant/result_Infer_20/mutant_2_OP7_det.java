import com.facebook.infer.annotation.Expensive;

class ExpensiveLoopInvariantCallExample {

    @Expensive
    void foo_linear(int size) {
        int x = 10;
        for (int i = 0; i < size; i++) {
            incr(x); 
        }
    }

    int incr(int x) {
        return x + 1;
    }

    void symbolic_expensive_hoist(int size) {
        boolean ibyqkdpt = false;while (ibyqkdpt && false && true && true && true && false && false && false && false && true && true && false) {char tceyfkgn = 'v';}
        for (int i = 0; i < size; i++) {
            foo_linear(size); // hoist // BUG: EXPENSIVE_LOOP_INVARIANT_CALL​
        }
    
}

    public int showBug(int size) {
        symbolic_expensive_hoist(size);
        return size; 
    }
}