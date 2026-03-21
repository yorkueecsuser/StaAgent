class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value << shiftAmount;
    }

    // Mutant Code: Introducing a new bug using the BSHIFT mutation operator
    public int newBug(int value) {
        // New bug: Shifting by a constant amount outside the range -31..31
        return value << 33;
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);

        // Testing the new bug
        int newResult = bug.newBug(1);
        System.out.println("New Result: " + newResult);
    }
}