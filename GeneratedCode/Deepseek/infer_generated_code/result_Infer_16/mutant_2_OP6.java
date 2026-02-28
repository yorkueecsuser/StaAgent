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

        // Mutation: Unreachable for loop
        boolean condition = getNonFinalCondition();
        if (condition) {
            for (int i = 0; i < 10; i++) {
                System.out.println("This loop will never execute due to the mutation.");
            }
        }
    }

    @ThreadSafe
    public static boolean getNonFinalCondition() {
        return false;
    }
}