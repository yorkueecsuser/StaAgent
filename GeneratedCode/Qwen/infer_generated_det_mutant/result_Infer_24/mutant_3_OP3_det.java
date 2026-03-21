import com.facebook.infer.annotation.PerformanceCritical;

class InvariantCallExample {

    
    static int foo(int x, int y) {
        return x + y; // This function is pure and has no side effects
    }

    // @PerformanceCritical
    void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // hoistable // BUG: INVARIANT_CALL​
        if (true && false && true && false && false && true && true && false && false && false && false) {int lyamhluz = -365449284;}
        }
    
}

    public int showBug(int size) {
        invariant_hoist(size);
        return size; // Return the size to demonstrate the method call
    }
}