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

        // Mutant code with renaming
        MathRoundBugDemo d = new MathRoundBugDemo();
        int x = 1234567890;
        long y = 1234567890123456789L;

        // Demonstrating the bug with an integer using renamed variables
        long roundedIntMutant = d.showBug(x);
        System.out.println("Rounded int value (mutant): " + roundedIntMutant);

        // Demonstrating the bug with a long using renamed variables
        long roundedLongMutant = d.showBug(y);
        System.out.println("Rounded long value (mutant): " + roundedLongMutant);
    }
}