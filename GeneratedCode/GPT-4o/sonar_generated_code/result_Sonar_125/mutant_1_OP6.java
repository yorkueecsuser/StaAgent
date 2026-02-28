class BitShiftDemo {

    public int showBug(int value, int shiftAmount) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { 
            // This loop is unreachable due to the false condition
        }
        return value << shiftAmount; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }

    public long showBugLong(long value, int shiftAmount) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { 
            // This loop is unreachable due to the false condition
        }
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
    }
    
    // This method ensures that the condition for the loop is dynamically determined at runtime
    private boolean getCondition() {
        return false; // This makes the loop conditionally unreachable
    }
}