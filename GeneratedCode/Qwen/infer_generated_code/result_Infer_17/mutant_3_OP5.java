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
        int[] arr = new int[10];

        // Inserting an unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse? 1 : 0) {
            case 1:
                // This case is unreachable because alwaysFalse is always false
                System.out.println("This is an unreachable switch case.");
                break;
        }

        return arr[Math.abs(y % 10)];
    }

    private boolean getAlwaysFalse() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }
}