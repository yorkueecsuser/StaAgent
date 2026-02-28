class BinaryOperatorBugDemo {

    public boolean showBug1(int a, int b) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always set to false by getCondition()
        }
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug2(int a, int b) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always set to false by getCondition()
        }
        if (a != a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug3(int a, int b) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always set to false by getCondition()
        }
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug4(int a, int b) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always set to false by getCondition()
        }
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public int showBug5() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always set to false by getCondition()
        }
        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
    }

    public int showBug6() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always set to false by getCondition()
        }
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
    }

    public boolean showBug7(String c) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always set to false by getCondition()
        }
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }

    // Utility method to simulate a condition that is always false
    private boolean getCondition() {
        return false;
    }
}