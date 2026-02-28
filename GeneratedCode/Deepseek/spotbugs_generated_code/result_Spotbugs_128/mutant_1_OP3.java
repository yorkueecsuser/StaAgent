class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        // Added unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This code should never execute.");
        }
        return value << shiftAmount;
    }

    // Method to return an always false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}