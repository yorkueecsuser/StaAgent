class ShiftBug {
    public int showBug(int x, int y) {
        boolean conditionWhile = false;
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop");
        }
        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    }
}