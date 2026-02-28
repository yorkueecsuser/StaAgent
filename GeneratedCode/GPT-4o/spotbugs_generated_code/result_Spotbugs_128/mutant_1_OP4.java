class BitShiftBugExample {

    public int showBug(int value, int shiftAmount) {
        // Performing a left shift operation by 32, which results in no shift.
        // This is the same as shifting by 0 because only the lower 5 bits of the shift amount are used.
        int result = value << shiftAmount; // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)

        // Unreachable if-else branch added
        boolean condition = getFalseCondition(); // This method always returns false
        if (condition) {
            System.out.println("This branch will not execute.");
        } else {
            System.out.println("Unreachable if-else statement added here.");
        }

        return result;
    }

    // A method that always returns false to make the if-else branch unreachable
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        BitShiftBugExample example = new BitShiftBugExample();
        int shiftedValue = example.showBug(1, 32);
        System.out.println("Shifted Value: " + shiftedValue);
    }
}