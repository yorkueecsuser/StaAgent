class IdentityBinaryExpressionExample {

    // Helper method to ensure the while loop condition is not a compile-time constant.
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug1(boolean a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug1");
        }
        // This bug is a logic error where the same expression is used on both sides of &&
        return a && a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug2(boolean a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug2");
        }
        // This bug is a logic error where the same expression is used on both sides of ||
        return a || a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug3(boolean a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug3");
        }
        // This bug is a logic error where the same expression is used on both sides of &
        return a & a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug4(boolean a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug4");
        }
        // This bug is a logic error where the same expression is used on both sides of |
        return a | a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug5(int a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug5");
        }
        // This bug is always false because the same expression is used on both sides of <
        return a < a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug6(int a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug6");
        }
        // This bug is always true because the same expression is used on both sides of <=
        return a <= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug7(int a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug7");
        }
        // This bug is always false because the same expression is used on both sides of >
        return a > a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug8(int a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug8");
        }
        // This bug is always true because the same expression is used on both sides of >=
        return a >= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug9(int a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug9");
        }
        // This bug is always true because the same expression is used on both sides of ==
        return a == a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug10(int a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug10");
        }
        // This bug is always false because the same expression is used on both sides of !=
        return a != a; // BUG: IdentityBinaryExpression
    }

    public int showBug11(int a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug11");
        }
        // This bug is always 1 because the same expression is used on both sides of /
        return a / a; // BUG: IdentityBinaryExpression
    }

    public int showBug12(int a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug12");
        }
        // This bug is always 0 because the same expression is used on both sides of %
        return a % a; // BUG: IdentityBinaryExpression
    }

    public int showBug13(int a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug13");
        }
        // This bug is always 0 because the same expression is used on both sides of -
        return a - a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug14(boolean a) {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("Unreachable while loop in showBug14");
        }
        // This bug is always false because the same expression is used on both sides of ^
        return a ^ a; // BUG: IdentityBinaryExpression
    }
}