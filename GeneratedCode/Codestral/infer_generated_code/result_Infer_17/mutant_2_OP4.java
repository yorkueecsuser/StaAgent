// Bug: INTEGER_OVERFLOW_L2
class IntegerOverflowL2 {

    public static int getUnknownValue() {
        // Simulate unknown method
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;  // Potential integer overflow
        int[] arr = new int[10];

        // Inserted unreachable if-else branch
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("This line should never execute.");
        } else {
            // This is the original code
            return arr[Math.abs(y % 10)];  // Array index might be out of bounds due to integer overflow
        }
    }

    public static void main(String[] args) {
        IntegerOverflowL2 obj = new IntegerOverflowL2();
        obj.showBug();
    }
}