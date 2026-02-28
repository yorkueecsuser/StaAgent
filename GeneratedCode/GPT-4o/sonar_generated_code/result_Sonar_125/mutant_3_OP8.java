class BitShiftDemo {

    public int showBug(int value, int shiftAmount) {
        return value << shiftAmount; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }

    public long showBugLong(long value, int shiftAmount) {
        return value << shiftAmount; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }

    public int showBugMutant(int x, int y) {
        return x << y; // Renamed variables: value -> x, shiftAmount -> y
    }

    public long showBugLongMutant(long x, int y) {
        return x << y; // Renamed variables: value -> x, shiftAmount -> y
    }

    public static void main(String[] args) {
        BitShiftDemo demo = new BitShiftDemo();

        // Demonstration with int
        int resultInt = demo.showBug(1, 32); // Shifting by 32 is equivalent to shifting by 0
        System.out.println("Shifting int 1 by 32 results in: " + resultInt);

        int resultIntMutant = demo.showBugMutant(1, 32); // Shifting by 32 is equivalent to shifting by 0
        System.out.println("Shifting int 1 by 32 in mutant method results in: " + resultIntMutant);

        // Demonstration with long
        long resultLong = demo.showBugLong(1L, 64); // Shifting by 64 is equivalent to shifting by 0
        System.out.println("Shifting long 1L by 64 results in: " + resultLong);
        
        long resultLongMutant = demo.showBugLongMutant(1L, 64); // Shifting by 64 is equivalent to shifting by 0
        System.out.println("Shifting long 1L by 64 in mutant method results in: " + resultLongMutant);
    }
}