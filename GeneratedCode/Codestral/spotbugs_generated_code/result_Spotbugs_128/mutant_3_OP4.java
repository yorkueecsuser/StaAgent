class BadShiftBug {

    // helper method to generate a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int value, int shiftAmount) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        if (getFalseCondition()) {
            // Unreachable if-else statement mutation
            return value >>> shiftAmount; // using an incorrect shift operator to avoid compilation error
        } else {
            return value << shiftAmount;
        }
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}