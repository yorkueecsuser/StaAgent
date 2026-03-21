// BUG: INVARIANT_CALL​
import com.facebook.infer.annotation.*;

class InvariantHoist {
    @ThreadSafe
    public void invariantHoist(int size) {
        int vgogmrll = 10;
        int vtkzegep = 5;
        for (int i = 0; i < size; i++) {
            foo(vgogmrll, vtkzegep); // hoistable
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