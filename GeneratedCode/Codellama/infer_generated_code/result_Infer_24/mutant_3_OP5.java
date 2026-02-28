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

    // Mutant Generation
    public void mutantGeneration(int size) {
        int x = 10;
        int y = 5;
        switch(getCondition()) {
            case 0:
                foo(x, y);
                break;
            default:
                break;
        }
    }

    // Helper method to return a condition that always evaluates to false
    private int getCondition() {
        return 0;
    }
}