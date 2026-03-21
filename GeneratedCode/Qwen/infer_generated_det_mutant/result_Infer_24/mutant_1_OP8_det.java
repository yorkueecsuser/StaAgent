import com.facebook.infer.annotation.PerformanceCritical;

class InvariantCallExample {

    
    static int foo(int x, int y) {
        return x + y; // This function is pure and has no side effects
    }

    // @PerformanceCritical
    void invariant_hoist(int size) {
        int ckkhmotl = 10;
        int hqcijdir = 5;
        for (int i = 0; i < size; i++) {
            foo(ckkhmotl, hqcijdir); // hoistable // BUG: INVARIANT_CALL​
        }
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return size; // Return the size to demonstrate the method call
    }
}