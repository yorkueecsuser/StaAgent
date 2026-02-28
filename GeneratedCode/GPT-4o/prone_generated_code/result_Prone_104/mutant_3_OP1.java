class MathRoundBugDemo {

    public long showBug(int value) {
        // Dead Store: Adding an unused variable declaration
        int abcdxyzh = 42;

        // Here we use Math.round with an integer, which implicitly casts the integer to a float,
        // causing potential precision loss for large integer values.
        return Math.round(value); // BUG: MathRoundIntLong
    }

    public long showBug(long value) {
        // Dead Store: Adding an unused variable declaration
        long efghijkl = 987654321L;

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
    }
}