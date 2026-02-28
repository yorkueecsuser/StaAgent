class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of &&
        return a && a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug1Mutant(boolean b) {
        // Mutant: Renamed variable from 'a' to 'b'
        return b && b; 
    }

    public boolean showBug2(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of ||
        return a || a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug2Mutant(boolean c) {
        // Mutant: Renamed variable from 'a' to 'c'
        return c || c; 
    }

    public boolean showBug3(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of &
        return a & a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug3Mutant(boolean d) {
        // Mutant: Renamed variable from 'a' to 'd'
        return d & d; 
    }

    public boolean showBug4(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of |
        return a | a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug4Mutant(boolean e) {
        // Mutant: Renamed variable from 'a' to 'e'
        return e | e; 
    }

    public boolean showBug5(int a) {
        // This bug is always false because the same expression is used on both sides of <
        return a < a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug5Mutant(int f) {
        // Mutant: Renamed variable from 'a' to 'f'
        return f < f; 
    }

    public boolean showBug6(int a) {
        // This bug is always true because the same expression is used on both sides of <=
        return a <= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug6Mutant(int g) {
        // Mutant: Renamed variable from 'a' to 'g'
        return g <= g; 
    }

    public boolean showBug7(int a) {
        // This bug is always false because the same expression is used on both sides of >
        return a > a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug7Mutant(int h) {
        // Mutant: Renamed variable from 'a' to 'h'
        return h > h; 
    }

    public boolean showBug8(int a) {
        // This bug is always true because the same expression is used on both sides of >=
        return a >= a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug8Mutant(int i) {
        // Mutant: Renamed variable from 'a' to 'i'
        return i >= i; 
    }

    public boolean showBug9(int a) {
        // This bug is always true because the same expression is used on both sides of ==
        return a == a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug9Mutant(int j) {
        // Mutant: Renamed variable from 'a' to 'j'
        return j == j; 
    }

    public boolean showBug10(int a) {
        // This bug is always false because the same expression is used on both sides of !=
        return a != a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug10Mutant(int k) {
        // Mutant: Renamed variable from 'a' to 'k'
        return k != k; 
    }

    public int showBug11(int a) {
        // This bug is always 1 because the same expression is used on both sides of /
        return a / a; // BUG: IdentityBinaryExpression
    }

    public int showBug11Mutant(int l) {
        // Mutant: Renamed variable from 'a' to 'l'
        return l / l; 
    }

    public int showBug12(int a) {
        // This bug is always 0 because the same expression is used on both sides of %
        return a % a; // BUG: IdentityBinaryExpression
    }

    public int showBug12Mutant(int m) {
        // Mutant: Renamed variable from 'a' to 'm'
        return m % m; 
    }

    public int showBug13(int a) {
        // This bug is always 0 because the same expression is used on both sides of -
        return a - a; // BUG: IdentityBinaryExpression
    }

    public int showBug13Mutant(int n) {
        // Mutant: Renamed variable from 'a' to 'n'
        return n - n; 
    }

    public boolean showBug14(boolean a) {
        // This bug is always false because the same expression is used on both sides of ^
        return a ^ a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug14Mutant(boolean o) {
        // Mutant: Renamed variable from 'a' to 'o'
        return o ^ o; 
    }
}