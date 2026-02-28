class BinaryOperatorBugDemo {

    public boolean showBug1(int a, int b) {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) { // Unreachable while loop
            // Unreachable code block
        }
        
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug2(int a, int b) {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) { // Unreachable while loop
            // Unreachable code block
        }
        
        if (a != a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug3(int a, int b) {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) { // Unreachable while loop
            // Unreachable code block
        }
        
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug4(int a, int b) {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) { // Unreachable while loop
            // Unreachable code block
        }
        
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public int showBug5() {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) { // Unreachable while loop
            // Unreachable code block
        }
        
        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
    }

    public int showBug6() {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) { // Unreachable while loop
            // Unreachable code block
        }
        
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
    }

    public boolean showBug7(String c) {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) { // Unreachable while loop
            // Unreachable code block
        }
        
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }
    
    // Helper method to provide a false condition dynamically
    private boolean getFalseCondition() {
        return false;
    }
}