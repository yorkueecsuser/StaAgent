class BadShiftBug {

    private boolean getCondition() {
        // This method is used to avoid using "false" directly in the condition
        return false;
    }

    public int showBug(int value, int shiftAmount) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        while (getCondition()) {
            // Added unreachable while loop
        }
        return value << shiftAmount;
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}