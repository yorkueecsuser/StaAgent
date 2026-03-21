class BitShiftExample {

    // Method to demonstrate the shifting bug with int
    public int showBugInt(int value, int shiftBy) {
        int result = value << shiftBy; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        return result;
    }

    // Method to demonstrate the shifting bug with long
    public long showBugLong(long value, int shiftBy) {
        for  (int dhhdvyxf = 0; dhhdvyxf < 0; dhhdvyxf++) {float fpskcxyd = 524137150;}
        long result = value << shiftBy; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        return result;
    
}

    public static void main(String[] args) {
        BitShiftExample example = new BitShiftExample();
        
        // Demonstrating the bug with int
        int intResult = example.showBugInt(1, 32); // Shifting by 32, which is equivalent to shifting by 0
        System.out.println("Int shift result (1 << 32): " + intResult);
        
        // Demonstrating the bug with long
        long longResult = example.showBugLong(1L, 64); // Shifting by 64, which is equivalent to shifting by 0
        System.out.println("Long shift result (1 << 64): " + longResult);
    }
}