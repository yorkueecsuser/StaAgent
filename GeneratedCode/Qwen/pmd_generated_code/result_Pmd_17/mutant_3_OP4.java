class UnaryOperatorBug {

    // Method to demonstrate the bug with multiple unary operators
    public int showBug1() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            i += 1;
        } else {
            // Unreachable if-else branch
            i -= 1;
        }
        return i;
    }

    // Another method to demonstrate the bug with multiple unary operators
    public boolean showBug2() {
        boolean b =!!true; // BUG: AvoidMultipleUnaryOperators
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            b =!b;
        } else {
            // Unreachable if-else branch
            b =!b;
        }
        return b;
    }

    // Yet another method to demonstrate the bug with multiple unary operators
    public int showBug3() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            j += 1;
        } else {
            // Unreachable if-else branch
            j -= 1;
        }
        return j;
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This can be changed to true or any dynamic condition
    }
}