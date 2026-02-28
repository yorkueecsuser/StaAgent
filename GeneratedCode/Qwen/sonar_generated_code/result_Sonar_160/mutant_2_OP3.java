class IdenticalExpressionsBug {

    public boolean showBug1(int a) {
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            return false; // This branch is unreachable if getCondition() always returns false
        }
    }

    public boolean showBug2(int a) {
        if (a!= a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            return true; // This branch is unreachable if getCondition() always returns false
        }
    }

    public boolean showBug3(int a, int b) {
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            return false; // This branch is unreachable if getCondition() always returns false
        }
    }

    public boolean showBug4(int a, int b) {
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            return true; // This branch is unreachable if getCondition() always returns false
        }
    }

    public int showBug5(int a) {
        int j = a / a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            j = 0; // This branch is unreachable if getCondition() always returns false
        }
    }

    public int showBug6(int a) {
        int k = a - a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            k = 1; // This branch is unreachable if getCondition() always returns false
        }
    }

    public boolean showBug7(Object c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            return false; // This branch is unreachable if getCondition() always returns false
        }
    }

    public int showBug8(int a) {
        int j = a << a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            j = 2; // This branch is unreachable if getCondition() always returns false
        }
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true/false dynamically
    }
}