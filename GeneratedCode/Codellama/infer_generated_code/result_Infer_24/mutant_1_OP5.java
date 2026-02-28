// BUG: INVARIANT_CALL (unreachable switch statement mutation)
import com.facebook.infer.annotation.*;

class InvariantHoist {
    @ThreadSafe
    public void invariantHoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // hoistable
        }
        // Unreachable switch statement mutation
        switch (0) {
            case 1:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
            default:
                // Default case
                System.out.println("This is the default case");
                break;
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