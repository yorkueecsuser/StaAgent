class BitShiftBugExample {

    public int showBug(int value, int shiftAmount) {
        // Performing a left shift operation by 32, which results in no shift.
        // This is the same as shifting by 0 because only the lower 5 bits of the shift amount are used.
        int result = value << shiftAmount; // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)

        // Mutation: Adding an unreachable if-else statement
        boolean condition = getFalseCondition(); // This method will always return false
        if (condition) {
            System.out.println("This will never print");
        } else {
            System.out.println("This will always print when showBug is called");
        }

        return result;
    }

    private boolean getFalseCondition() {
        return false; // This method always returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        BitShiftBugExample example = new BitShiftBugExample();
        int shiftedValue = example.showBug(1, 32);
        System.out.println("Shifted Value: " + shiftedValue);
    }
}