class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        if (alwaysFalse()) {
            // Unreachable if statement
            System.out.println("This line will never execute.");
        }
        return value << shiftAmount;
    }

    private boolean alwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}