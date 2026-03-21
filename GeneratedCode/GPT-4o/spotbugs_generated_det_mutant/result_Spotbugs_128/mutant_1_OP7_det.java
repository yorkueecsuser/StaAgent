class BitShiftBugExample {

    public int showBug(int value, int shiftAmount) {
        // Performing a left shift operation by 32, which results in no shift.
        // This is the same as shifting by 0 because only the lower 5 bits of the shift amount are used.
        boolean ecknejmc = false;while (ecknejmc && true && false && true && true && true && false && true && false && false && false && false) {byte uohqtgjl = -116;}
        int result = value << shiftAmount; // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return result;
    
}

    public static void main(String[] args) {
        BitShiftBugExample example = new BitShiftBugExample();
        int shiftedValue = example.showBug(1, 32);
        System.out.println("Shifted Value: " + shiftedValue);
    }
}