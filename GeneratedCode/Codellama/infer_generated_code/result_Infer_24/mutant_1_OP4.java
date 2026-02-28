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

    // Mutant code 1: Unreachable if-else statement
    public void mutant_1() {
        int x = 10;
        int y = 5;
        for (int i = 0; i < 5; i++) {
            if (false) {
                foo(x, y);
            } else {
                i++;
            }
        }
    }

    // Mutant code 2: Unreachable if-else statement
    public void mutant_2() {
        int x = 10;
        int y = 5;
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                foo(x, y);
            } else {
                i++;
            }
        }
    }

    // Mutant code 3: Unreachable if-else statement
    public void mutant_3() {
        int x = 10;
        int y = 5;
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                foo(x, y);
            } else {
                i++;
            }
        }
    }
}