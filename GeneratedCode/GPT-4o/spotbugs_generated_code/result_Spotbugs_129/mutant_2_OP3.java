class ShiftOperationBug {

    public int showBug(int x, int y) {
        // Unreachable if statement added
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        }

        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        return result;
    }
    
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + result);
    }
}