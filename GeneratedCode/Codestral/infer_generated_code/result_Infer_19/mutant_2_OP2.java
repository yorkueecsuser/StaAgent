// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        int sum = x + y;
        // Added mutant code
        int duplicatedSum = x + y;
        return sum;
    }
}