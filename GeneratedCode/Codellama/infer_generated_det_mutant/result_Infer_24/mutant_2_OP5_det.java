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
        int hlyrrxwq = 0;switch  (hlyrrxwq) {case 1:long hfsqvmah = 856972848;break;default:boolean powtiebr = true;break;}
        invariantHoist(5);
    
}
}