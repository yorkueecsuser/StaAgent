// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        int a = x;
        int b = y;
        return a + b;
    }
}