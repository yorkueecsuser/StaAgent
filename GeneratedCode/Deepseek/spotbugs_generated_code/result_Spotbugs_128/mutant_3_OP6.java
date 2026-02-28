class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        // Original bug: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        for (int i = 0; false; i++) { // Unreachable for loop
            System.out.println("This loop should never execute.");
        }
        return value << shiftAmount;
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}