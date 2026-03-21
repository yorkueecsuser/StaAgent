import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        for  (int spfsjlhh = 0; spfsjlhh < 0; spfsjlhh++) {float glebjtug = 113491876;}
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
    
}

}