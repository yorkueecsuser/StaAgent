class UnaryOperatorBug {

    // Method to demonstrate the bug with multiple unary operators
    public int showBug1() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            i = i + 1;
        }
        return i;
    }

    // Another method to demonstrate the bug with multiple unary operators
    public boolean showBug2() {
        boolean b =!!true; // BUG: AvoidMultipleUnaryOperators
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            b =!b;
        }
        return b;
    }

    // Yet another method to demonstrate the bug with multiple unary operators
    public int showBug3() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            j = j - 1;
        }
        return j;
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true or false dynamically
    }
}