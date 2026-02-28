// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    private static boolean getUnreachableCondition() {
        return false;   // This method will always return false
    }

    public static int showBug(int x, int y) {
        if (getUnreachableCondition()) {
            // This block is unreachable
            throw new AssertionError("This block should not be reached");
        } else {
            return x + y;
        }
    }
}