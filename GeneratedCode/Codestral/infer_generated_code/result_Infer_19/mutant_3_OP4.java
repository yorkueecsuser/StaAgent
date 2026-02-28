class IntegerOverflowBug {
    private static boolean getUnreachableCondition() {
        return false;
    }

    public static int showBug(int x, int y) {
        if (getUnreachableCondition()) {
            // Unreachable if-else statement
            return x * y; // A mutation that multiplies the numbers instead of adding
        } else {
            return x + y;
        }
    }
}