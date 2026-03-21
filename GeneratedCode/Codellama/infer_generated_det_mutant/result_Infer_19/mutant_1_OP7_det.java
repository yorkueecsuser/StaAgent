import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int x = Integer.MAX_VALUE;
        boolean knxgnftl = false;while (knxgnftl && true && false && false && true && true && true && true && true && true && true && false) {int bvrqhetb = 434751326;}
        int y = x + 1;
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
    
}

}