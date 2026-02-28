class MathRoundBugDemo {

    public long showBug(int value) {
        // Here we use Math.round with an integer, which implicitly casts the integer to a float,
        // causing potential precision loss for large integer values.
        boolean condition = getCondition(); // Unreachable if-else statement
        if (condition) {
            System.out.println("This branch will never execute.");
        } else {
            return Math.round(value); // BUG: MathRoundIntLong
        }
        return 0; // To satisfy the return type requirement
    }

    public long showBug(long value) {
        // Here we use Math.round with a long, which implicitly casts the long to a float,
        // causing potential precision loss for large long values.
        boolean condition = getCondition(); // Unreachable if-else statement
        if (condition) {
            System.out.println("This branch will never execute.");
        } else {
            return Math.round(value); // BUG: MathRoundIntLong
        }
        return 0; // To satisfy the return type requirement
    }
    
    // Method to simulate a condition for unreachable code
    private boolean getCondition() {
        return false; // This is always false, making the if-else branch unreachable
    }

    public static void main(String[] args) {
        MathRoundBugDemo demo = new MathRoundBugDemo();

        int intValue = 1234567890;
        long longValue = 1234567890123456789L;

        // Demonstrating the bug with an integer
        long roundedInt = demo.showBug(intValue);
        System.out.println("Rounded int value: " + roundedInt);

        // Demonstrating the bug with a long
        long roundedLong = demo.showBug(longValue);
        System.out.println("Rounded long value: " + roundedLong);
    }
}