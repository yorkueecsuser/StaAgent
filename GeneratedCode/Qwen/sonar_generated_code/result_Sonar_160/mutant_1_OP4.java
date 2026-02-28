class IdenticalExpressionsBug {

    public boolean showBug1(int a) {
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because condition is always false
            return false;
        } else {
            return true;
        }
    }

    public boolean showBug2(int a) {
        if (a!= a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because condition is always false
            return false;
        } else {
            return true;
        }
    }

    public boolean showBug3(int a, int b) {
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because condition is always false
            return false;
        } else {
            return true;
        }
    }

    public boolean showBug4(int a, int b) {
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because condition is always false
            return false;
        } else {
            return true;
        }
    }

    public int showBug5(int a) {
        int j = a / a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
        
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because condition is always false
            j = 0;
        } else {
            j = 1;
        }
        return j;
    }

    public int showBug6(int a) {
        int k = a - a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
        
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because condition is always false
            k = 0;
        } else {
            k = 1;
        }
        return k;
    }

    public boolean showBug7(Object c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
        
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because condition is always false
            return false;
        } else {
            return true;
        }
    }

    public int showBug8(int a) {
        int j = a << a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
        
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because condition is always false
            j = 0;
        } else {
            j = 1;
        }
        return j;
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true/false based on some logic
    }
}