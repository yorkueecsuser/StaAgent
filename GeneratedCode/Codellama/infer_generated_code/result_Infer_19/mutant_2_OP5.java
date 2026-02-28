import com.facebook.infer.annotation.*;
import androidx.annotation.UiThread;

class IntegerOverflowU5 {

    @ThreadSafe
    @UiThread
    public static void showBug() {
        int x = Integer.MAX_VALUE;
        int y = x + 1;
        System.out.println(y); // BUG: INTEGER_OVERFLOW_U5

        // Add mutant code
        boolean condition = getCondition();
        if (condition) {
            switch (getSwitchValue()) {
                case 1:
                    System.out.println("Case 1");
                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                default:
                    System.out.println("Default");
                    break;
            }
        }
    }

    // Method to generate a switch value
    private static int getSwitchValue() {
        return 0;
    }

    // Method to generate a condition
    private static boolean getCondition() {
        return false;
    }

}