import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
    }

    // Mutant 1: Renaming the "x" variable to "z"
    @ThreadSafe
    @UiThread
    public static void showMutant1() {
        int z = Integer.MAX_VALUE;
        int y = z + 1;
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
    }

    // Mutant 2: Renaming the "y" variable to "w"
    @ThreadSafe
    @UiThread
    public static void showMutant2() {
        int x = Integer.MAX_VALUE;
        int w = x + 1;
        System.out.println(w); // BUG: INTEGER_OVERFLOW_U5
    }

}