// BUG: INTEGER_OVERFLOW_U5 with Mutation: Unreachable while loop
class IntegerOverflowBug {
    private static boolean getCondition() {
        return false;
    }

    public static int showBug(int x, int y) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code, inserted as a result of the mutation
            System.out.println("This line should never be executed");
        }
        return x + y;
    }
}