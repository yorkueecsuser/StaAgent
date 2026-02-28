class IdenticalExpressionsBug {

    public boolean showBug1(int a) {
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
        }
    }

    public boolean showBug2(int a) {
        if (a!= a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
        }
    }

    public boolean showBug3(int a, int b) {
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
        }
    }

    public boolean showBug4(int a, int b) {
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
        }
    }

    public int showBug5(int a) {
        int j = a / a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
        }
    }

    public int showBug6(int a) {
        int k = a - a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
        }
    }

    public boolean showBug7(Object c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
        }
    }

    public int showBug8(int a) {
        int j = a << a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}