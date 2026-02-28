// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code branch
            System.out.println("This is an unreachable code branch");
        } else {
            return x + y;
        }
    }

    private static boolean getUnreachableCondition() {
        return false;
    }
}