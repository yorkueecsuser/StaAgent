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

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            default:
                // This is the default case which may be reached if the switch value changes
                System.out.println("Default case of unreachable switch.");
        }
    }

    // Method to ensure the switch condition is not a compile-time constant
    private static int getUnreachableSwitchValue() {
        return -1; // This value ensures the switch case is always the default
    }
}