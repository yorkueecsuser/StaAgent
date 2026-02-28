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

    // Mutant 1: Unreachable while loop
    @ThreadSafe
    public void invariantHoistUnreachableWhileLoop(int size) {
        int x = 10;
        int y = 5;
        while (false) {
            for (int i = 0; i < size; i++) {
                foo(x, y); // hoistable
            }
        }
    }

    // Mutant 2: Unreachable for loop
    @ThreadSafe
    public void invariantHoistUnreachableForLoop(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; false; i++) {
            foo(x, y); // hoistable
        }
    }

    // Mutant 3: Unreachable if statement
    @ThreadSafe
    public void invariantHoistUnreachableIfStatement(int size) {
        int x = 10;
        int y = 5;
        if (false) {
            for (int i = 0; i < size; i++) {
                foo(x, y); // hoistable
            }
        }
    }

}