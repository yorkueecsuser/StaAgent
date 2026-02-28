// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        int zabcdefg; // Dead store mutant
        return x + y;
    }
}