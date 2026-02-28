class UnaryOperatorBug {

    // Method to demonstrate the bug with multiple unary operators
    public int showBug1() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                i = 10; // This will never be executed
                break;
            case 2:
                i = 20; // This will never be executed
                break;
        }

        return i;
    }

    // Another method to demonstrate the bug with multiple unary operators
    public boolean showBug2() {
        boolean b =!!true; // BUG: AvoidMultipleUnaryOperators

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                b = false; // This will never be executed
                break;
            case 2:
                b = true; // This will never be executed
                break;
        }

        return b;
    }

    // Yet another method to demonstrate the bug with multiple unary operators
    public int showBug3() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                j = 30; // This will never be executed
                break;
            case 2:
                j = 40; // This will never be executed
                break;
        }

        return j;
    }

    // Helper method to simulate dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true/false dynamically
    }

    // Helper method to simulate dynamic value for switch
    private int getValue(boolean condition) {
        return condition? 1 : 0; // This method ensures the switch condition is not a compile-time constant
    }
}