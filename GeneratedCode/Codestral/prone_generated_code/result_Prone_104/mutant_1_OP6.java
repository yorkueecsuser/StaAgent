class MathRoundIntLongBug {

    public int showBug(long number) {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable for loop
            System.out.println("This line will never be executed");
        }
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    }
}