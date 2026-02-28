class UnaryOperatorBug {

    // Method to demonstrate the bug with multiple unary operators
    public int showBug1() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // This loop is unreachable because conditionFor is always false
        }

        return i;
    }

    // Another method to demonstrate the bug with multiple unary operators
    public boolean showBug2() {
        boolean b =!!true; // BUG: AvoidMultipleUnaryOperators

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // This loop is unreachable because conditionFor is always false
        }

        return b;
    }

    // Yet another method to demonstrate the bug with multiple unary operators
    public int showBug3() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int k = 0; conditionFor; k++) {
            // This loop is unreachable because conditionFor is always false
        }

        return j;
    }

    // Helper method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}