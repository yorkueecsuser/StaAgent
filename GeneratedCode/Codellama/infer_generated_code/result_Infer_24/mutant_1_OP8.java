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
}

// Mutant 1: Rename variable x to z
class InvariantHoist {
    @ThreadSafe
    public void invariantHoist(int size) {
        int z = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(z, y); // hoistable
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
}

// Mutant 2: Rename variable y to w
class InvariantHoist {
    @ThreadSafe
    public void invariantHoist(int size) {
        int x = 10;
        int w = 5;
        for (int i = 0; i < size; i++) {
            foo(x, w); // hoistable
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
}