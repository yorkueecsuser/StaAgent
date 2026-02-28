class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        // Unreachable while loop mutation
        boolean conditionWhile1 = getCondition();
        while (conditionWhile1) {
            // Unreachable code
        }
        // This bug is a logic error where the same expression is used on both sides of &&
        return a && a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug2(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of ||
        return a || a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug3(boolean a) {
        // Unreachable while loop mutation
        boolean conditionWhile3 = getCondition();
        while (conditionWhile3) {
            // Unreachable code
        }
        // This bug is a logic error where the same expression is used on both sides of &
        return a & a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug4(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of |
        return a | a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug5(int a) {
        // Unreachable while loop mutation
        boolean conditionWhile5 = getCondition();
        while (conditionWhile5) {
            // Unreachable code
        }
        // This bug is always false because the same expression is used on both sides of <
        return a < a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug6(int a) {
        // This bug is always true because the same expression is used on both sides of <=
        return a <= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug7(int a) {
        // Unreachable while loop mutation
        boolean conditionWhile7 = getCondition();
        while (conditionWhile7) {
            // Unreachable code
        }
        // This bug is always false because the same expression is used on both sides of >
        return a > a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug8(int a) {
        // This bug is always true because the same expression is used on both sides of >=
        return a >= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug9(int a) {
        // Unreachable while loop mutation
        boolean conditionWhile9 = getCondition();
        while (conditionWhile9) {
            // Unreachable code
        }
        // This bug is always true because the same expression is used on both sides of ==
        return a == a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug10(int a) {
        // This bug is always false because the same expression is used on both sides of !=
        return a != a; // BUG: IdentityBinaryExpression
    }

    public int showBug11(int a) {
        // Unreachable while loop mutation
        boolean conditionWhile11 = getCondition();
        while (conditionWhile11) {
            // Unreachable code
        }
        // This bug is always 1 because the same expression is used on both sides of /
        return a / a; // BUG: IdentityBinaryExpression
    }

    public int showBug12(int a) {
        // This bug is always 0 because the same expression is used on both sides of %
        return a % a; // BUG: IdentityBinaryExpression
    }

    public int showBug13(int a) {
        // Unreachable while loop mutation
        boolean conditionWhile13 = getCondition();
        while (conditionWhile13) {
            // Unreachable code
        }
        // This bug is always 0 because the same expression is used on both sides of -
        return a - a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug14(boolean a) {
        // This bug is always false because the same expression is used on both sides of ^
        return a ^ a; // BUG: IdentityBinaryExpression
    }

    // Helper method to simulate dynamic condition
    private boolean getCondition() {
        return false;
    }
}