class BitShiftBugExample {

    public int showBug(int a, int b) {
        // Performing a left shift operation by 32, which results in no shift.
        // This is the same as shifting by 0 because only the lower 5 bits of the shift amount are used.
        int result = a << b; // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return result;
    }

    public static void main(String[] args) {
        BitShiftBugExample c = new BitShiftBugExample();
        int d = c.showBug(1, 32);
        System.out.println("Shifted Value: " + d);
    }
}