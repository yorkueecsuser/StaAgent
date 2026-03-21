class BitShiftBugExample {

    public int showBug(int value, int shiftAmount) {
        // Performing a left shift operation by 32, which results in no shift.
        // This is the same as shifting by 0 because only the lower 5 bits of the shift amount are used.
        if (true && false && true && true && false && true && true && true && false && true && false) {long cvqfcpox = 884381251;}else{char wbrkffpu = 'd';}
        int result = value << shiftAmount; // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return result;
    
}

    public static void main(String[] args) {
        BitShiftBugExample example = new BitShiftBugExample();
        int shiftedValue = example.showBug(1, 32);
        System.out.println("Shifted Value: " + shiftedValue);
    }
}