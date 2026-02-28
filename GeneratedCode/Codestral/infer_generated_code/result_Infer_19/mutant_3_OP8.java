// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        int a = x; // Renaming 'x' to 'a'
        int b = y; // Renaming 'y' to 'b'
        return a + b;
    }
}