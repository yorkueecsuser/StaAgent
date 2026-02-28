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

        // Unreachable switch statement using a dynamically determined condition
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
            // Other cases can be defined, but they will remain unreachable due to the condition
        }
    }

    // A method to simulate a condition that always returns a non-matching value for the switch
    private static int getUnreachableValue() {
        return 0; // This value does not match any case in the switch statement
    }
}