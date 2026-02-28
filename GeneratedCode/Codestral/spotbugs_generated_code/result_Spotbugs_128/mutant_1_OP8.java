class BadShiftBug {

    public int showBug(int val, int shiftAmount) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return val << shiftAmount;
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int resultant = bug.showBug(1, 32);
        System.out.println("Result: " + resultant);
    }
}