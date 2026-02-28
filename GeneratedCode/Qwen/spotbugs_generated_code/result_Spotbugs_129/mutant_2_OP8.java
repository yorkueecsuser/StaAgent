class ShiftOperationBug {

    // Method to demonstrate the bug
    public int showBug(int x, int y) {
        // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY) 
        return x << 8 + y; // This line contains the bug

        // Mutated code with renaming operator
        int a = x;
        int b = y;
        return a << 8 + b; // This line also contains the bug
    }

    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(2, 3);
        System.out.println("Result of showBug(2, 3): " + result);

        // Mutated code with renaming operator
        ShiftOperationBug demo = new ShiftOperationBug();
        int res = demo.showBug(2, 3);
        System.out.println("Result of showBug(2, 3): " + res);
    }
}