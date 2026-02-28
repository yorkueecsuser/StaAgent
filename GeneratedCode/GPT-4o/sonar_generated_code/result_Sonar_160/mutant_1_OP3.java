class BinaryOperatorBugDemo {

    public boolean showBug1(int a, int b) {
        boolean condition = getFalseCondition();
        if (condition) { // Unreachable if statement
            return false;
        }
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug2(int a, int b) {
        boolean condition = getFalseCondition();
        if (condition) { // Unreachable if statement
            return false;
        }
        if (a != a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug3(int a, int b) {
        boolean condition = getFalseCondition();
        if (condition) { // Unreachable if statement
            return false;
        }
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug4(int a, int b) {
        boolean condition = getFalseCondition();
        if (condition) { // Unreachable if statement
            return false;
        }
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public int showBug5() {
        boolean condition = getFalseCondition();
        if (condition) { // Unreachable if statement
            return 0;
        }
        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
    }

    public int showBug6() {
        boolean condition = getFalseCondition();
        if (condition) { // Unreachable if statement
            return 0;
        }
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
    }

    public boolean showBug7(String c) {
        boolean condition = getFalseCondition();
        if (condition) { // Unreachable if statement
            return false;
        }
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }

    // Helper method to simulate a false condition
    private boolean getFalseCondition() {
        return false;
    }
}