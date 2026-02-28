// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        // Dead Store Mutation
        int unusedVariable = 0; // Randomly generated variable name and type
        return x + y;
    }
}