class BitShiftBugExample {

    public int showBug(int value, int shiftAmount) {
        boolean unreachableCondition = getAlwaysFalseCondition();
        if (unreachableCondition) {
            System.out.println("This will never be printed");
        }
        
        // Performing a left shift operation, which may result in no shift due to bug.
        int result = value << shiftAmount; // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return result;
    }

    private boolean getAlwaysFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        BitShiftBugExample example = new BitShiftBugExample();
        int shiftedValue = example.showBug(1, 32);
        System.out.println("Shifted Value: " + shiftedValue);
    }
}