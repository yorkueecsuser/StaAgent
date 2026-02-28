class BitShiftBugExample {

    public int showBug(int value, int shiftAmount) {
        // Performing a left shift operation by 32, which results in no shift.
        // This is the same as shifting by 0 because only the lower 5 bits of the shift amount are used.
        int result = value << shiftAmount; // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)

        // Inserting unreachable switch statement as a mutation.
        int unreachableSwitchCondition = getDynamicValue(); // Assume this method dynamically determines the value at runtime
        switch (unreachableSwitchCondition) {
            case 99999: // A case that will not be reached
                System.out.println("This case is unreachable.");
                break;
        }

        return result;
    }

    private int getDynamicValue() {
        return -1; // This ensures the switch case is never reached during normal execution.
    }

    public static void main(String[] args) {
        BitShiftBugExample example = new BitShiftBugExample();
        int shiftedValue = example.showBug(1, 32);
        System.out.println("Shifted Value: " + shiftedValue);
    }
}