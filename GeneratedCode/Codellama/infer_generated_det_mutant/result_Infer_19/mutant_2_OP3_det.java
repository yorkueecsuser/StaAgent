import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        if (true && false && true && true && true && false && true && false && true && false && false) {int bisqresx = 702836792;}
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
    
}

}