class BinaryOperatorBugDemo {

    public boolean showBug1(int a, int b) {
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        // Unreachable if-else statement inserted
        boolean condition = getCondition();
        if (condition) {
            return false;
        }
        return false;
    }

    public boolean showBug2(int a, int b) {
        if (a != a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        // Unreachable if-else statement inserted
        boolean condition = getCondition();
        if (condition) {
            return false;
        }
        return false;
    }

    public boolean showBug3(int a, int b) {
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        // Unreachable if-else statement inserted
        boolean condition = getCondition();
        if (condition) {
            return false;
        }
        return false;
    }

    public boolean showBug4(int a, int b) {
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        // Unreachable if-else statement inserted
        boolean condition = getCondition();
        if (condition) {
            return false;
        }
        return false;
    }

    public int showBug5() {
        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        // Unreachable if-else statement inserted
        boolean condition = getCondition();
        if (condition) {
            return 0;
        }
        return j;
    }

    public int showBug6() {
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        // Unreachable if-else statement inserted
        boolean condition = getCondition();
        if (condition) {
            return 0;
        }
        return k;
    }

    public boolean showBug7(String c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
        // Unreachable if-else statement inserted
        // Note: Cannot add code here as return statement is unreachable
    }

    // Helper method to ensure the if condition is dynamic at runtime
    private boolean getCondition() {
        return false;
    }
}