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
        int niknjkfx = 0;switch  (niknjkfx) {case 1:short gpjjnmbg = -2351;break;default:int zkxwsbeo = -946222873;break;}
        invariantHoist(5);
    
}
}