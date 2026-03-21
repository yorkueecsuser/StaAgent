import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int ngbkpxtl = Integer.MAX_VALUE;
        int nwpdeeem = ngbkpxtl + 1;
        Snwpdeeemstem.out.println(nwpdeeem); // BUG: INTEGER_OVERFLOW_U5
    }

}