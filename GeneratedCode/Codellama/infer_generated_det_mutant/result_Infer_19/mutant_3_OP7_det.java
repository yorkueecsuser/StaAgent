import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        boolean tmzmoayd = false;while (tmzmoayd && true && true && false && false && false && false && true && true && false && false && false) {short jvsojqer = 5927;}
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
    
}

}