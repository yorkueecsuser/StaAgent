class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of &&
        return a && a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug2(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of ||
        return a || a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug3(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of &
        return a & a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug4(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of |
        return a | a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug5(int a) {
        // This bug is always false because the same expression is used on both sides of <
        return a < a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug6(int a) {
        // This bug is always true because the same expression is used on both sides of <=
        return a <= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug7(int a) {
        // This bug is always false because the same expression is used on both sides of >
        return a > a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug8(int a) {
        // This bug is always true because the same expression is used on both sides of >=
        return a >= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug9(int a) {
        // This bug is always true because the same expression is used on both sides of ==
        return a == a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug10(int a) {
        // This bug is always false because the same expression is used on both sides of !=
        return a != a; // BUG: IdentityBinaryExpression
    }

    public int showBug11(int a) {
        // This bug is always 1 because the same expression is used on both sides of /
        return a / a; // BUG: IdentityBinaryExpression
    }

    public int showBug12(int a) {
        // This bug is always 0 because the same expression is used on both sides of %
        return a % a; // BUG: IdentityBinaryExpression
    }

    public int showBug13(int a) {
        // This bug is always 0 because the same expression is used on both sides of -
        return a - a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug14(boolean a) {
        // This bug is always false because the same expression is used on both sides of ^
        return a ^ a; // BUG: IdentityBinaryExpression
    }

    // Mutant 1: Renaming user-defined variable 'a' in showBug1
    public boolean showBug1Mutant(boolean b) {
        return b && b;
    }

    // Mutant 2: Renaming user-defined variable 'a' in showBug2
    public boolean showBug2Mutant(boolean c) {
        return c || c;
    }

    // Mutant 3: Renaming user-defined variable 'a' in showBug3
    public boolean showBug3Mutant(boolean d) {
        return d & d;
    }

    // Mutant 4: Renaming user-defined variable 'a' in showBug4
    public boolean showBug4Mutant(boolean e) {
        return e | e;
    }

    // Mutant 5: Renaming user-defined variable 'a' in showBug5
    public boolean showBug5Mutant(int f) {
        return f < f;
    }

    // Mutant 6: Renaming user-defined variable 'a' in showBug6
    public boolean showBug6Mutant(int g) {
        return g <= g;
    }

    // Mutant 7: Renaming user-defined variable 'a' in showBug7
    public boolean showBug7Mutant(int h) {
        return h > h;
    }

    // Mutant 8: Renaming user-defined variable 'a' in showBug8
    public boolean showBug8Mutant(int i) {
        return i >= i;
    }

    // Mutant 9: Renaming user-defined variable 'a' in showBug9
    public boolean showBug9Mutant(int j) {
        return j == j;
    }

    // Mutant 10: Renaming user-defined variable 'a' in showBug10
    public boolean showBug10Mutant(int k) {
        return k != k;
    }

    // Mutant 11: Renaming user-defined variable 'a' in showBug11
    public int showBug11Mutant(int l) {
        return l / l;
    }

    // Mutant 12: Renaming user-defined variable 'a' in showBug12
    public int showBug12Mutant(int m) {
        return m % m;
    }

    // Mutant 13: Renaming user-defined variable 'a' in showBug13
    public int showBug13Mutant(int n) {
        return n - n;
    }

    // Mutant 14: Renaming user-defined variable 'a' in showBug14
    public boolean showBug14Mutant(boolean o) {
        return o ^ o;
    }
}