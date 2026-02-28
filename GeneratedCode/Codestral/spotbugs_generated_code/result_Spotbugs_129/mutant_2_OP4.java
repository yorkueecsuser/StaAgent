class ShiftBug {
    public int showBug(int x, int y) {
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)

        if (isUnreachableCondition()) { // Unreachable if-else statement mutation
            System.out.println("This statement should never execute.");
        } else {
            // This else block is also unreachable, but for the sake of the example, it's included.
            System.out.println("This else statement should also never execute.");
        }

        return result;
    }

    private boolean isUnreachableCondition() {
        return false; // This condition is always false, making the if block unreachable.
    }
}