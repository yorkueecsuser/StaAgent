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

        int pbsiardi = 1234567890;
        long ihtqtwyj = 1234567890123456789L;

        // Demonstrating the bug with an integer
        long onwtoqno = demo.showBug(pbsiardi);
        System.out.println("Rounded int value: " + onwtoqno);

        // Demonstrating the bug with a long
        long zgvijwfg = demo.showBug(ihtqtwyj);
        System.out.println("Rounded long value: " + zgvijwfg);
    }
}