class BinaryOperatorBugDemo {

    public boolean showBug1(int a, int b) {
        boolean condition = getUnreachableCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("This will never print.");
        }
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug2(int a, int b) {
        boolean condition = getUnreachableCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("This will never print.");
        }
        if (a != a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug3(int a, int b) {
        boolean condition = getUnreachableCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("This will never print.");
        }
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug4(int a, int b) {
        boolean condition = getUnreachableCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("This will never print.");
        }
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public int showBug5() {
        boolean condition = getUnreachableCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("This will never print.");
        }
        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
    }

    public int showBug6() {
        boolean condition = getUnreachableCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("This will never print.");
        }
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
    }

    public boolean showBug7(String c) {
        boolean condition = getUnreachableCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("This will never print.");
        }
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }

    private boolean getUnreachableCondition() {
        // Simulate a dynamic condition that is always false at runtime
        return false;
    }
}