class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of &&
        boolean result = a && a; // BUG: IdentityBinaryExpression
        return result;
    }

    public boolean showBug2(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of ||
        boolean result = a || a; // BUG: IdentityBinaryExpression
        return result;
    }

    public boolean showBug3(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of &
        boolean result = a & a; // BUG: IdentityBinaryExpression
        return result;
    }

    public boolean showBug4(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of |
        boolean result = a | a; // BUG: IdentityBinaryExpression
        return result;
    }

    public boolean showBug5(int a) {
        // This bug is always false because the same expression is used on both sides of <
        boolean result = a < a; // BUG: IdentityBinaryExpression
        return result;
    }

    public boolean showBug6(int a) {
        // This bug is always true because the same expression is used on both sides of <=
        boolean result = a <= a; // BUG: IdentityBinaryExpression
        return result;
    }

    public boolean showBug7(int a) {
        // This bug is always false because the same expression is used on both sides of >
        boolean result = a > a; // BUG: IdentityBinaryExpression
        return result;
    }

    public boolean showBug8(int a) {
        // This bug is always true because the same expression is used on both sides of >=
        boolean result = a >= a; // BUG: IdentityBinaryExpression
        return result;
    }

    public boolean showBug9(int a) {
        // This bug is always true because the same expression is used on both sides of ==
        boolean result = a == a; // BUG: IdentityBinaryExpression
        return result;
    }

    public boolean showBug10(int a) {
        // This bug is always false because the same expression is used on both sides of !=
        boolean result = a != a; // BUG: IdentityBinaryExpression
        return result;
    }

    public int showBug11(int a) {
        // This bug is always 1 because the same expression is used on both sides of /
        int result = a / a; // BUG: IdentityBinaryExpression
        return result;
    }

    public int showBug12(int a) {
        // This bug is always 0 because the same expression is used on both sides of %
        int result = a % a; // BUG: IdentityBinaryExpression
        return result;
    }

    public int showBug13(int a) {
        // This bug is always 0 because the same expression is used on both sides of -
        int result = a - a; // BUG: IdentityBinaryExpression
        return result;
    }

    public boolean showBug14(boolean a) {
        // This bug is always false because the same expression is used on both sides of ^
        boolean result = a ^ a; // BUG: IdentityBinaryExpression
        return result;
    }
}