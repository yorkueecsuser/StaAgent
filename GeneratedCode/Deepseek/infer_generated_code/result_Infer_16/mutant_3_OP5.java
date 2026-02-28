import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {
    private static int switchCondition = -1;

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int n = Integer.MAX_VALUE;// BUG: INTEGER_OVERFLOW_L1
        int m = n + 3;
        System.out.println(m);

        // Add an unreachable switch statement
        switch (getSwitchCondition()) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
    }

    private static int getSwitchCondition() {
        return switchCondition;
    }
}