class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of &&
        return a && a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug1_mutant(boolean b) {
        // This bug is a logic error where the same expression is used on both sides of &&
        return b && b; // Renamed variable a to b
    }

    public boolean showBug2(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of ||
        return a || a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug2_mutant(boolean c) {
        // This bug is a logic error where the same expression is used on both sides of ||
        return c || c; // Renamed variable a to c
    }

    public boolean showBug3(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of &
        return a & a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug3_mutant(boolean d) {
        // This bug is a logic error where the same expression is used on both sides of &
        return d & d; // Renamed variable a to d
    }

    public boolean showBug4(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of |
        return a | a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug4_mutant(boolean e) {
        // This bug is a logic error where the same expression is used on both sides of |
        return e | e; // Renamed variable a to e
    }

    public boolean showBug5(int a) {
        // This bug is always false because the same expression is used on both sides of <
        return a < a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug5_mutant(int f) {
        // This bug is always false because the same expression is used on both sides of <
        return f < f; // Renamed variable a to f
    }

    public boolean showBug6(int a) {
        // This bug is always true because the same expression is used on both sides of <=
        return a <= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug6_mutant(int g) {
        // This bug is always true because the same expression is used on both sides of <=
        return g <= g; // Renamed variable a to g
    }

    public boolean showBug7(int a) {
        // This bug is always false because the same expression is used on both sides of >
        return a > a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug7_mutant(int h) {
        // This bug is always false because the same expression is used on both sides of >
        return h > h; // Renamed variable a to h
    }

    public boolean showBug8(int a) {
        // This bug is always true because the same expression is used on both sides of >=
        return a >= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug8_mutant(int i) {
        // This bug is always true because the same expression is used on both sides of >=
        return i >= i; // Renamed variable a to i
    }

    public boolean showBug9(int a) {
        // This bug is always true because the same expression is used on both sides of ==
        return a == a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug9_mutant(int j) {
        // This bug is always true because the same expression is used on both sides of ==
        return j == j; // Renamed variable a to j
    }

    public boolean showBug10(int a) {
        // This bug is always false because the same expression is used on both sides of !=
        return a != a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug10_mutant(int k) {
        // This bug is always false because the same expression is used on both sides of !=
        return k != k; // Renamed variable a to k
    }

    public int showBug11(int a) {
        // This bug is always 1 because the same expression is used on both sides of /
        return a / a; // BUG: IdentityBinaryExpression
    }

    public int showBug11_mutant(int l) {
        // This bug is always 1 because the same expression is used on both sides of /
        return l / l; // Renamed variable a to l
    }

    public int showBug12(int a) {
        // This bug is always 0 because the same expression is used on both sides of %
        return a % a; // BUG: IdentityBinaryExpression
    }

    public int showBug12_mutant(int m) {
        // This bug is always 0 because the same expression is used on both sides of %
        return m % m; // Renamed variable a to m
    }

    public int showBug13(int a) {
        // This bug is always 0 because the same expression is used on both sides of -
        return a - a; // BUG: IdentityBinaryExpression
    }

    public int showBug13_mutant(int n) {
        // This bug is always 0 because the same expression is used on both sides of -
        return n - n; // Renamed variable a to n
    }

    public boolean showBug14(boolean a) {
        // This bug is always false because the same expression is used on both sides of ^
        return a ^ a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug14_mutant(boolean o) {
        // This bug is always false because the same expression is used on both sides of ^
        return o ^ o; // Renamed variable a to o
    }
}