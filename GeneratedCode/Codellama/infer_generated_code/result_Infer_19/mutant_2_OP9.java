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

}

// Mutant 1: Equivalent Loop Replacement
class IntegerOverflowU5Mutant1 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        do {
            int x = Integer.MAX_VALUE;
            int y = x + 1;
            System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
        } while (false);
    }

}

// Mutant 2: Equivalent Loop Replacement
class IntegerOverflowU5Mutant2 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        do {
            System.out.println(y); // BUG: INTEGER_OVERFLOW_U5
        } while (false);
    }

}