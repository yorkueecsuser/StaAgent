class MathRoundBugDemo {

    public long showBug(int value) {
        // Here we use Math.round with an integer, which implicitly casts the integer to a float,
        // causing potential precision loss for large integer values.
        return Math.round(value); // BUG: MathRoundIntLong
    }

    public long showBug(long value) {
        // Here we use Math.round with a long, which implicitly casts the long to a float,
        // causing potential precision loss for large long values.
        return Math.round(value); // BUG: MathRoundIntLong
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

        // Inserted unreachable switch statement
        int unreachableCondition = getCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("Unreachable code block case 1");
                break;
            case 2:
                System.out.println("Unreachable code block case 2");
                break;
            default:
                System.out.println("This is the default unreachable case");
                break;
        }
    }

    // Method to simulate a runtime condition, ensuring switch remains unreachable
    private static int getCondition() {
        return -1; // This will always return a value that doesn't trigger any cases
    }
}