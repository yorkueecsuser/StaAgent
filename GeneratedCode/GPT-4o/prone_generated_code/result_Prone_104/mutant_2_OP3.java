class MathRoundBugDemo {

    public long showBug(int value) {
        // Here we use Math.round with an integer, which implicitly casts the integer to a float,
        // causing potential precision loss for large integer values.
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because condition is always false in getCondition()
            System.out.println("This is an unreachable if statement block.");
        }
        return Math.round(value); // BUG: MathRoundIntLong
    }

    public long showBug(long value) {
        // Here we use Math.round with a long, which implicitly casts the long to a float,
        // causing potential precision loss for large long values.
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because condition is always false in getCondition()
            System.out.println("This is an unreachable if statement block.");
        }
        return Math.round(value); // BUG: MathRoundIntLong
    }

    private boolean getCondition() {
        // Returns false but is not a compile-time constant, making the if condition always false at runtime.
        return false;
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