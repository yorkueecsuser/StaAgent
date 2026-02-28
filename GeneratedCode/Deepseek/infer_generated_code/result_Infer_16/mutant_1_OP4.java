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

        // Unreachable if-else statement mutant
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is reachable.");
        } else {
            System.out.println("This code is unreachable.");
        }
    }

    public static boolean getCondition() {
        return false;
    }
}