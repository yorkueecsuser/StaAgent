class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        return a && a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug1Mutant(boolean b) {
        return b && b; // MUTANT: Renamed 'a' to 'b'
    }

    public boolean showBug2(int a) {
        return a == a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug2Mutant(int c) {
        return c == c; // MUTANT: Renamed 'a' to 'c'
    }

    public boolean showBug3(int a) {
        return a < a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug3Mutant(int d) {
        return d < d; // MUTANT: Renamed 'a' to 'd'
    }

    public int showBug4(int a) {
        return a / a; // BUG: IdentityBinaryExpression
    }

    public int showBug4Mutant(int e) {
        return e / e; // MUTANT: Renamed 'a' to 'e'
    }

    public int showBug5(int a) {
        return a % a; // BUG: IdentityBinaryExpression
    }

    public int showBug5Mutant(int f) {
        return f % f; // MUTANT: Renamed 'a' to 'f'
    }

    public int showBug6(int a) {
        return a - a; // BUG: IdentityBinaryExpression
    }

    public int showBug6Mutant(int g) {
        return g - g; // MUTANT: Renamed 'a' to 'g'
    }

    public static void main(String[] args) {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        System.out.println("showBug1: " + example.showBug1(true));
        System.out.println("showBug1Mutant: " + example.showBug1Mutant(true));
        System.out.println("showBug2: " + example.showBug2(5));
        System.out.println("showBug2Mutant: " + example.showBug2Mutant(5));
        System.out.println("showBug3: " + example.showBug3(5));
        System.out.println("showBug3Mutant: " + example.showBug3Mutant(5));
        System.out.println("showBug4: " + example.showBug4(5));
        System.out.println("showBug4Mutant: " + example.showBug4Mutant(5));
        System.out.println("showBug5: " + example.showBug5(5));
        System.out.println("showBug5Mutant: " + example.showBug5Mutant(5));
        System.out.println("showBug6: " + example.showBug6(5));
        System.out.println("showBug6Mutant: " + example.showBug6Mutant(5));
    }
}