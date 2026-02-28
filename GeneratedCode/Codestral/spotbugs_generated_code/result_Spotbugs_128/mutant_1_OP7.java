class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        while (getFalseCondition()) {  // Unreachable while loop
            System.out.println("This line should never execute.");
        }
        return value << shiftAmount;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}