import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int jfbvqxiu = 0;switch  (jfbvqxiu) {case 1:byte ovwvzitq = -40;break;default:short dxvjnjnm = 8022;break;}
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
    
}

}