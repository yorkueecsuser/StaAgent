class ShiftBugDemonstration {

    public int showBug1(int value) {
        // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        return value << 32; // This is equivalent to shifting by 0
    }

    public int showBug2(int value) {
        // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        return value >> 33; // This is equivalent to shifting by 1
    }

    public long showBug3(long value) {
        // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        return value << 64; // This is equivalent to shifting by 0
    }

    public long showBug4(long value) {
        // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        return value >>> 65; // This is equivalent to shifting by 1
    }

    public static void main(String[] args) {
        ShiftBugDemonstration demo = new ShiftBugDemonstration();
        System.out.println("showBug1 result: " + demo.showBug1(1)); // Expected: 1
        System.out.println("showBug2 result: " + demo.showBug2(2)); // Expected: 1
        System.out.println("showBug3 result: " + demo.showBug3(1L)); // Expected: 1
        System.out.println("showBug4 result: " + demo.showBug4(2L)); // Expected: 1
    }
}