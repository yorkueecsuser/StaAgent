// Bug: INTEGER_OVERFLOW_L2
class IntegerOverflowL2 {

    public static int getUnknownValue() {
        // Simulate unknown method
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;  // Potential integer overflow

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block of code is unreachable
            System.out.println("Unreachable code");
        }

        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];  // Array index might be out of bounds due to integer overflow
    }

    public static boolean getCondition() {
        // Simulate unknown method
        // This method always returns false to make the for loop unreachable
        return false;
    }

    public static void main(String[] args) {
        IntegerOverflowL2 obj = new IntegerOverflowL2();
        obj.showBug();
    }
}