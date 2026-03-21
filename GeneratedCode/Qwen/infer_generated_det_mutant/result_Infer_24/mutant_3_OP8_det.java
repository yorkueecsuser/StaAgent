import com.facebook.infer.annotation.PerformanceCritical;

class InvariantCallExample {

    
    static int foo(int x, int y) {
        return x + y; // This function is pure and has no side effects
    }

    // @PerformanceCritical
    void invariant_hoist(int size) {
        int mcicewzp = 10;
        int jqthafjq = 5;
        for (int i = 0; i < size; i++) {
            foo(mcicewzp, jqthafjq); // hoistable // BUG: INVARIANT_CALL​
        }
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return size; // Return the size to demonstrate the method call
    }
}