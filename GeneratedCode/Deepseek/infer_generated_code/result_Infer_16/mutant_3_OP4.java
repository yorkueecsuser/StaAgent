import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int n = Integer.MAX_VALUE;// BUG: INTEGER_OVERFLOW_L1
        int m = n + 3;
        System.out.println(m);

        boolean condition = getCondition(); // Add a method to get condition
        if (condition) { // Use a non-final variable in if condition
            // Do nothing
        }
        else {
            System.out.println("This code will NEVER be reached");
        }
    }

    public static boolean getCondition() {
        return false; // Add a method to return a false value
    }
}