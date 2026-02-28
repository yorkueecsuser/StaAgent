// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable code
        }
        return x + y;
    }

    private static boolean getCondition() {
        return false;
    }
}