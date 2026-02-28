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
            foo(x, y); // hoistable // BUG: INVARIANT_CALL​
        }
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return size; // Return the size to demonstrate the method call
    }

    // Mutant code with renaming mutation operator applied
    void invariant_hoist_mutant(int size) {
        int a = 10; // Renamed 'x' to 'a'
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(a, y); // hoistable // BUG: INVARIANT_CALL​
        }
    }

    public int showBugMutant(int size) {
        invariant_hoist_mutant(size);
        return size; // Return the size to demonstrate the method call
    }
}