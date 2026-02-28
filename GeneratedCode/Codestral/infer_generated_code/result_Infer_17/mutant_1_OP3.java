// Bug: INTEGER_OVERFLOW_L2
class IntegerOverflowL2 {

    public static int getUnknownValue() {
        // Simulate unknown method
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public static boolean getUnreachableCondition() {
        // Simulate unknown method for unreachable condition
        return false;
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;  // Potential integer overflow

        // Inserting unreachable if statement
        if (getUnreachableCondition()) {
            // This block is unreachable
            System.out.println("This line will never be executed.");
        }

        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];  // Array index might be out of bounds due to integer overflow
    }

    public static void main(String[] args) {
        IntegerOverflowL2 obj = new IntegerOverflowL2();
        obj.showBug();
    }
}