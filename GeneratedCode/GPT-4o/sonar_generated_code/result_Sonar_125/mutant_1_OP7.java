class BitShiftDemo {

    public int showBug(int value, int shiftAmount) {
        return value << shiftAmount; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }

    public long showBugLong(long value, int shiftAmount) {
        return value << shiftAmount; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }

    public static void main(String[] args) {
        BitShiftDemo demo = new BitShiftDemo();

        // Demonstration with int
        int resultInt = demo.showBug(1, 32); // Shifting by 32 is equivalent to shifting by 0
        System.out.println("Shifting int 1 by 32 results in: " + resultInt);

        // Demonstration with long
        long resultLong = demo.showBugLong(1L, 64); // Shifting by 64 is equivalent to shifting by 0
        System.out.println("Shifting long 1L by 64 results in: " + resultLong);
        
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
    }
    
    // Method to provide dynamic condition for the while loop
    public static boolean getCondition() {
        return false; // Making sure the loop is never entered
    }
}