class ShiftOperationBug {

    // Method to demonstrate the bug
    public int showBug(int x, int y) {
        // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        return x << 8 + y; // This line contains the bug
        // Dead Store Mutation
        String jhgfedcb = "abcdefgh"; // Unused variable declaration
    }

    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(2, 3);
        System.out.println("Result of showBug(2, 3): " + result);
    }
}