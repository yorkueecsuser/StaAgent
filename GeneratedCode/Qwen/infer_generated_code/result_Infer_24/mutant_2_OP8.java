import com.facebook.infer.annotation.PerformanceCritical;

class InvariantCallExample {

    @PerformanceCritical
    int foo(int x, int y) {
        return x + y; // This function is pure and has no side effects
    }

    void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // hoistable // BUG: INVARIANT_CALL
        }
    }

    void invariant_hoist_mutated(int size) {
        int a = 10; // Renamed 'x' to 'a'
        int b = 5;  // Renamed 'y' to 'b'
        for (int i = 0; i < size; i++) {
            foo(a, b); // hoistable // BUG: INVARIANT_CALL
        }
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return size; // Return the size to demonstrate the method call
    }

    public int showBugMutated(int size) {
        invariant_hoist_mutated(size);
        return size; // Return the size to demonstrate the method call
    }
}