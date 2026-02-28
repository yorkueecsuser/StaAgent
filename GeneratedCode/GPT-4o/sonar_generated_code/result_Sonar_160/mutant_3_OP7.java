class BinaryOperatorBugDemo {

    public boolean showBug1(int a, int b) {
        boolean conditionWhile = getUnreachableCondition(); // Ensure condition is dynamically determined
        while (conditionWhile) { // Unreachable while loop
            // This block is intentionally left empty
        }
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug2(int a, int b) {
        boolean conditionWhile = getUnreachableCondition(); // Ensure condition is dynamically determined
        while (conditionWhile) { // Unreachable while loop
            // This block is intentionally left empty
        }
        if (a != a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug3(int a, int b) {
        boolean conditionWhile = getUnreachableCondition(); // Ensure condition is dynamically determined
        while (conditionWhile) { // Unreachable while loop
            // This block is intentionally left empty
        }
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug4(int a, int b) {
        boolean conditionWhile = getUnreachableCondition(); // Ensure condition is dynamically determined
        while (conditionWhile) { // Unreachable while loop
            // This block is intentionally left empty
        }
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public int showBug5() {
        boolean conditionWhile = getUnreachableCondition(); // Ensure condition is dynamically determined
        while (conditionWhile) { // Unreachable while loop
            // This block is intentionally left empty
        }
        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
    }

    public int showBug6() {
        boolean conditionWhile = getUnreachableCondition(); // Ensure condition is dynamically determined
        while (conditionWhile) { // Unreachable while loop
            // This block is intentionally left empty
        }
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
    }

    public boolean showBug7(String c) {
        boolean conditionWhile = getUnreachableCondition(); // Ensure condition is dynamically determined
        while (conditionWhile) { // Unreachable while loop
            // This block is intentionally left empty
        }
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }

    // This method simulates a condition that is always false at runtime
    private boolean getUnreachableCondition() {
        return false;
    }
}