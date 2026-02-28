// Bug: INTEGER_OVERFLOW_L2
class IntegerOverflowL2 {

    public static int getUnknownValue() {
        // Simulate unknown method
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public static boolean getFalseCondition() {
        // This method always returns false
        return false;
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;  // Potential integer overflow

        // Add unreachable switch statement
        boolean condition = getFalseCondition();
        switch (condition? 1 : 0) {
            case 1:
                // This code will never be executed
                System.out.println("Unreachable code executed.");
                break;
            default:
                break;
        }

        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];  // Array index might be out of bounds due to integer overflow
    }

    public static void main(String[] args) {
        IntegerOverflowL2 obj = new IntegerOverflowL2();
        obj.showBug();
    }
}