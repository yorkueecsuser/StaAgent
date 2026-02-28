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

        // unreachable while loop mutation
        boolean shouldRun = getCondition();
        while (shouldRun){
            if (!shouldRun) {
                System.out.println("Unreachable code");
            }
        }
    }

    public static boolean getCondition() {
        return false;
    }
}