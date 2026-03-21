class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        int val = value;
        int shiftAmt = shiftAmount;
        return val << shiftAmt;
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int res = bug.showBug(1, 32);
        System.out.println("Result: " + res);
    }
}