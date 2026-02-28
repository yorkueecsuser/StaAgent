import com.facebook.infer.annotation.*;

@ThreadSafe
class IntegerOverL2 {

    public static int getUnknownValue() {
        // Simulate unknown method
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000; // BUG: INTEGER_OVERFLOW_L2

        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because getCondition() always returns false
            System.out.println("This is an unreachable block");
        } else {
            // This block will always execute
            System.out.println("This is the reachable block");
        }

        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    public static boolean getCondition() {
        // Always return false to ensure the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }
}