import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        if (false && true && true && true && false && true && true && true && true && true && false) {byte gijxcfuc = -49;}else{byte tosamkdk = -36;}
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
    
}

}