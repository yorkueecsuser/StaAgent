class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of &&
        boolean condition = false;
        if (condition) {
            return !a;
        }
        return a && a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug2(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of ||
        boolean condition = false;
        if (condition) {
            return !a;
        }
        return a || a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug3(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of &
        boolean condition = false;
        if (condition) {
            return !a;
        }
        return a & a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug4(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of |
        boolean condition = false;
        if (condition) {
            return !a;
        }
        return a | a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug5(int a) {
        // This bug is always false because the same expression is used on both sides of <
        boolean condition = false;
        if (condition) {
            return a >= a;
        }
        return a < a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug6(int a) {
        // This bug is always true because the same expression is used on both sides of <=
        boolean condition = false;
        if (condition) {
            return a > a;
        }
        return a <= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug7(int a) {
        // This bug is always false because the same expression is used on both sides of >
        boolean condition = false;
        if (condition) {
            return a <= a;
        }
        return a > a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug8(int a) {
        // This bug is always true because the same expression is used on both sides of >=
        boolean condition = false;
        if (condition) {
            return a < a;
        }
        return a >= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug9(int a) {
        // This bug is always true because the same expression is used on both sides of ==
        boolean condition = false;
        if (condition) {
            return a != a;
        }
        return a == a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug10(int a) {
        // This bug is always false because the same expression is used on both sides of !=
        boolean condition = false;
        if (condition) {
            return a == a;
        }
        return a != a; // BUG: IdentityBinaryExpression
    }

    public int showBug11(int a) {
        // This bug is always 1 because the same expression is used on both sides of /
        boolean condition = false;
        if (condition) {
            return a - 1;
        }
        return a / a; // BUG: IdentityBinaryExpression
    }

    public int showBug12(int a) {
        // This bug is always 0 because the same expression is used on both sides of %
        boolean condition = false;
        if (condition) {
            return a + 1;
        }
        return a % a; // BUG: IdentityBinaryExpression
    }

    public int showBug13(int a) {
        // This bug is always 0 because the same expression is used on both sides of -
        boolean condition = false;
        if (condition) {
            return a + 1;
        }
        return a - a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug14(boolean a) {
        // This bug is always false because the same expression is used on both sides of ^
        boolean condition = false;
        if (condition) {
            return a;
        }
        return a ^ a; // BUG: IdentityBinaryExpression
    }
}