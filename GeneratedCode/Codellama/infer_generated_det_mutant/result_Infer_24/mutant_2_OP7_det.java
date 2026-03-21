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
        boolean dyoiksgv = false;while (dyoiksgv && true && true && true && true && true && true && true && true && true && false && false) {long myrmcqxd = 760831488;}
        invariantHoist(5);
    
}
}