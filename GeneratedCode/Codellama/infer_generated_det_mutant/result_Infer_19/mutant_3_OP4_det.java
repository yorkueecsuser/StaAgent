import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        if (false && true && true && false && false && true && true && false && true && false && false) {double panthwqy = -202236990;}else{String tudayefw = "wrarwvtc";}
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
    
}

}