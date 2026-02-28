class BitShiftBugExample {

    public int showBug(int value, int shiftAmount) {
        // Perform a left shift operation by 32, which results in no shift.
        // This is the same as shifting by 0 because only the lower 5 bits of the shift amount are used.
        int result = value << shiftAmount; // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)

        // Introduce an unreachable if-else block
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is unreachable due to the false condition
            System.out.println("Unreachable code executed.");
        } else {
            // Since the condition is always false, execution will come here
            System.out.println("This is the else branch of the unreachable if statement.");
        }

        return result;
    }

    // Helper method to provide a dynamic false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        BitShiftBugExample example = new BitShiftBugExample();
        int shiftedValue = example.showBug(1, 32);
        System.out.println("Shifted Value: " + shiftedValue);
    }
}