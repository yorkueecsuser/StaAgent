class ShiftOperationBug {

    public int showBug(int a, int b) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = a << 8 + b; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        return result;
    }
    
    public static void main(String[] args) {
        ShiftOperationBug c = new ShiftOperationBug();
        int d = c.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + d);
    }
}