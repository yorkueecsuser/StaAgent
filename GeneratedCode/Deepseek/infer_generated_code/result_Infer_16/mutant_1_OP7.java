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

        boolean unreachableLoopCondition = getCondition();
        while (unreachableLoopCondition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    private static boolean getCondition() {
        // This method returns a condition that is guaranteed to be unreachable
        return false;
    }
}