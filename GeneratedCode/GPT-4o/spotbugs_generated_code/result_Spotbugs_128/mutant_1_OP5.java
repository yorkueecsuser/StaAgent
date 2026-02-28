class BitShiftBugExample {

    public int showBug(int value, int shiftAmount) {
        // Performing a left shift operation by 32, which results in no shift.
        // This is the same as shifting by 0 because only the lower 5 bits of the shift amount are used.
        int result = value << shiftAmount; // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        
        // Mutation: Insert an unreachable switch statement
        int condition = getUnreachableCondition();
        switch (condition) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }

        return result;
    }

    // Method to ensure the switch condition is unreachable
    private int getUnreachableCondition() {
        return 0; // This will never match the case 1.
    }

    public static void main(String[] args) {
        BitShiftBugExample example = new BitShiftBugExample();
        int shiftedValue = example.showBug(1, 32);
        System.out.println("Shifted Value: " + shiftedValue);
    }
}