// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        int sum = x + y;
        // Mutation Operator: Duplication
        int dupSum = x + y;
        return sum;
    }
}