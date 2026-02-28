class BitShiftDemo {

    public int showBug(int value, int shiftAmount) {
        // Adding an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block will never execute
            System.out.println("Unreachable code in showBug method.");
        }
        return value << shiftAmount; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }

    public long showBugLong(long value, int shiftAmount) {
        // Adding an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block will never execute
            System.out.println("Unreachable code in showBugLong method.");
        }
        return value << shiftAmount; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }

    // Method to provide a dynamic false condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BitShiftDemo demo = new BitShiftDemo();

        // Demonstration with int
        int resultInt = demo.showBug(1, 32); // Shifting by 32 is equivalent to shifting by 0
        System.out.println("Shifting int 1 by 32 results in: " + resultInt);

        // Demonstration with long
        long resultLong = demo.showBugLong(1L, 64); // Shifting by 64 is equivalent to shifting by 0
        System.out.println("Shifting long 1L by 64 results in: " + resultLong);
    }
}