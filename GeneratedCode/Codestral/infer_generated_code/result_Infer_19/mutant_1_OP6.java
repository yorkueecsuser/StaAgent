// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop inserted
            System.out.println("This is an unreachable for loop");
        }
        return x + y;
    }

    private static boolean getCondition() {
        return false; // The condition is always false, making the loop unreachable
    }
}