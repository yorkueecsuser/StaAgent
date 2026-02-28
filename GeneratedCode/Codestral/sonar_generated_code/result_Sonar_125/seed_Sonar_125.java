class ShiftBug {
    public int showBug(int value) {
        // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        int shiftedValue = value >> 32;
        return shiftedValue;
    }

    public static void main(String[] args) {
        ShiftBug bug = new ShiftBug();
        int result = bug.showBug(5);
        System.out.println("Result: " + result);
    }
}