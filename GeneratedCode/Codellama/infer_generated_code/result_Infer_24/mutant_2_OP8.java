// BUG: INVARIANT_CALL​
import com.facebook.infer.annotation.*;

class InvariantHoist {
    @ThreadSafe
    public void invariantHoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // hoistable
        }
    }

    @ThreadSafe
    @TrueOnNull
    public int foo(int x, int y) {
        return x + y;
    }

    public void showBug() {
        invariantHoist(5);
    }

    // Mutant 1: Renaming variable `x` to `a`
    @ThreadSafe
    public void invariantHoist(int a) {
        int y = 5;
        for (int i = 0; i < a; i++) {
            foo(a, y); // hoistable
        }
    }

    // Mutant 2: Renaming variable `y` to `b`
    @ThreadSafe
    public void invariantHoist(int size) {
        int x = 10;
        int b = 5;
        for (int i = 0; i < size; i++) {
            foo(x, b); // hoistable
        }
    }
}