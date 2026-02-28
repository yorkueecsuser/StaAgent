class BinaryOperatorBugDemo {

    public boolean showBug1(int a, int b) {
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        
        // Unreachable if statement
        boolean condition1 = getFalseCondition();
        if (condition1) {
            System.out.println("This will never print.");
        }

        return false;
    }

    public boolean showBug2(int a, int b) {
        if (a != a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }

        // Unreachable if statement
        boolean condition2 = getFalseCondition();
        if (condition2) {
            System.out.println("This will never execute.");
        }

        return false;
    }

    public boolean showBug3(int a, int b) {
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }

        // Unreachable if statement
        boolean condition3 = getFalseCondition();
        if (condition3) {
            System.out.println("Unreachable code segment.");
        }

        return false;
    }

    public boolean showBug4(int a, int b) {
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }

        // Unreachable if statement
        boolean condition4 = getFalseCondition();
        if (condition4) {
            System.out.println("This code will never run.");
        }

        return false;
    }

    public int showBug5() {
        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator

        // Unreachable if statement
        boolean condition5 = getFalseCondition();
        if (condition5) {
            System.out.println("Unreachable statement in showBug5.");
        }

        return j;
    }

    public int showBug6() {
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator

        // Unreachable if statement
        boolean condition6 = getFalseCondition();
        if (condition6) {
            System.out.println("Unreachable statement in showBug6.");
        }

        return k;
    }

    public boolean showBug7(String c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }

    // Helper method to simulate a false condition
    private boolean getFalseCondition() {
        return false;
    }
}