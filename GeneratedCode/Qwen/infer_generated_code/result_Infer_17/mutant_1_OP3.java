import com.facebook.infer.annotation.*;

@ThreadSafe
class IntegerOverL2 {

    public static int getUnknownValue() {
        // Simulate unknown method
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public boolean getCondition() {
        // This method returns a condition that is always false at runtime
        return System.currentTimeMillis() == 0;
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000; // BUG: INTEGER_OVERFLOW_L2

        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            y = 0;
        }

        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }
}