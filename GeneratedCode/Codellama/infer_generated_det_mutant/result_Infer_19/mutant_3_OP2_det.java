import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {
@ ThreadSafe @ UiThread public static void showBug() {
    int x = Integer.MAX_VALUE;
    x = Integer.MAX_VALUE;
    int y = x + 1;
    System.out.println(y);
}

}