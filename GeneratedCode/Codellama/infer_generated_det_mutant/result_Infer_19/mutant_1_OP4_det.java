import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        if (true && true && false && false && true && false && false && false && false && false && false) {float sajlgnhj = -867256838;}else{short uxjgiohw = 5173;}
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
    
}

}