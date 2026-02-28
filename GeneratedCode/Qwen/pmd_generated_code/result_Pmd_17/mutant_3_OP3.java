class UnaryOperatorBug {

    // Method to demonstrate the bug with multiple unary operators
    public int showBug1() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code due to condition always being false at runtime
            i = 0;
        }
        return i;
    }

    // Another method to demonstrate the bug with multiple unary operators
    public boolean showBug2() {
        boolean b =!!true; // BUG: AvoidMultipleUnaryOperators
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code due to condition always being false at runtime
            b = false;
        }
        return b;
    }

    // Yet another method to demonstrate the bug with multiple unary operators
    public int showBug3() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code due to condition always being false at runtime
            j = 0;
        }
        return j;
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }
}