class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is a logic error where the same expression is used on both sides of &&
        return a && a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug2(boolean a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is a logic error where the same expression is used on both sides of ||
        return a || a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug3(boolean a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is a logic error where the same expression is used on both sides of &
        return a & a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug4(boolean a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is a logic error where the same expression is used on both sides of |
        return a | a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug5(int a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is always false because the same expression is used on both sides of <
        return a < a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug6(int a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is always true because the same expression is used on both sides of <=
        return a <= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug7(int a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is always false because the same expression is used on both sides of >
        return a > a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug8(int a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is always true because the same expression is used on both sides of >=
        return a >= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug9(int a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is always true because the same expression is used on both sides of ==
        return a == a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug10(int a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is always false because the same expression is used on both sides of !=
        return a != a; // BUG: IdentityBinaryExpression
    }

    public int showBug11(int a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is always 1 because the same expression is used on both sides of /
        return a / a; // BUG: IdentityBinaryExpression
    }

    public int showBug12(int a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is always 0 because the same expression is used on both sides of %
        return a % a; // BUG: IdentityBinaryExpression
    }

    public int showBug13(int a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is always 0 because the same expression is used on both sides of -
        return a - a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug14(boolean a) {
        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // This bug is always false because the same expression is used on both sides of ^
        return a ^ a; // BUG: IdentityBinaryExpression
    }

    // Helper method to simulate a non-final condition for unreachable code
    private boolean getCondition() {
        return false;
    }
}