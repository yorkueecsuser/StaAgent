class BinaryOperatorBugDemo {

    public boolean showBug1(int a, int b) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable loop
        }
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug2(int a, int b) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable loop
        }
        if (a != a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug3(int a, int b) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable loop
        }
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug4(int a, int b) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable loop
        }
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public int showBug5() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable loop
        }
        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
    }

    public int showBug6() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable loop
        }
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
    }

    public boolean showBug7(String c) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable loop
        }
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }

    private boolean getCondition() {
        return false; // This method ensures that the condition is not a compile-time constant.
    }

}