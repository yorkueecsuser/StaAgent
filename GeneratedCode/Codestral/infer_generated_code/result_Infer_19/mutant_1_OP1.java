// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        int deadStoreVar; // Unused variable declaration
        return x + y;
    }
}