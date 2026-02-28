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

    // Mutant code with renaming of variable 'x' to 'a'
    void invariant_hoist_mutant_a(int size) {
        int a = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(a, y); // hoistable // BUG: INVARIANT_CALL
        }
    }

    // Mutant code with renaming of variable 'y' to 'b'
    void invariant_hoist_mutant_b(int size) {
        int x = 10;
        int b = 5;
        for (int i = 0; i < size; i++) {
            foo(x, b); // hoistable // BUG: INVARIANT_CALL
        }
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return size; // Return the size to demonstrate the method call
    }
}