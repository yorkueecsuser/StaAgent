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

        int gubnsxrm = 1234567890;
        long jjwyhmyh = 1234567890123456789L;

        // Demonstrating the bug with an integer
        long grvikhvn = demo.showBug(gubnsxrm);
        System.out.println("Rounded int value: " + grvikhvn);

        // Demonstrating the bug with a long
        long utvgandx = demo.showBug(jjwyhmyh);
        System.out.println("Rounded long value: " + utvgandx);
    }
}