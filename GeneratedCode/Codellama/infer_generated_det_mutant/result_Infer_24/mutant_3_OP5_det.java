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
        int irjxdxri = 0;switch  (irjxdxri) {case 1:float ytdvxtfq = -775800288;break;default:char eadhyoch = 'd';break;}
        invariantHoist(5);
    
}
}