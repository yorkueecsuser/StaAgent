// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        boolean unreachableCondition = getUnreachableCondition(); // Added method call to determine unreachable condition
        if (unreachableCondition) { // Inserted unreachable if branch
            System.out.println("This statement is unreachable");
        }
        return x + y;
    }

    private static boolean getUnreachableCondition() {
        return false; // Always returns false to make the if branch unreachable
    }
}