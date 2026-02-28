class ShiftOperationBug {

    public int showBug(int x, int y) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        return result;
    }
    
    public static void main(String[] args) {
        ShiftOperationBug a = new ShiftOperationBug(); // Variable renaming applied here
        int b = a.showBug(1, 2); // Variable renaming applied here
        System.out.println("Result of showBug(1, 2): " + b); // Variable renaming applied here
    }
}