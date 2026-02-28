class ShiftOperationBug {

    public int showBug(int x, int y) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        return result;
    }
    
    public static void main(String[] args) {
        ShiftOperationBug a = new ShiftOperationBug(); // Renamed bugDemo to a
        int b = a.showBug(1, 2); // Renamed result to b
        System.out.println("Result of showBug(1, 2): " + b); // Updated variable name to b
    }
}