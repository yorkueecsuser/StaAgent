class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        String xabcdefg = "unused"; // Dead Store
        return a && a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug2(int a) {
        int yhijklmn = 0; // Dead Store
        return a == a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug3(int a) {
        boolean zopqrstu = true; // Dead Store
        return a < a; // BUG: IdentityBinaryExpression
    }

    public int showBug4(int a) {
        double vvwxyzab = 3.14; // Dead Store
        return a / a; // BUG: IdentityBinaryExpression
    }

    public int showBug5(int a) {
        char tefghijk = 'c'; // Dead Store
        return a % a; // BUG: IdentityBinaryExpression
    }

    public int showBug6(int a) {
        long rstuvwxy = 123456789L; // Dead Store
        return a - a; // BUG: IdentityBinaryExpression
    }

    public static void main(String[] args) {
        IdentityBinaryExpressionExample example = new IdentityBinaryExpressionExample();
        System.out.println("showBug1: " + example.showBug1(true));
        System.out.println("showBug2: " + example.showBug2(5));
        System.out.println("showBug3: " + example.showBug3(5));
        System.out.println("showBug4: " + example.showBug4(5));
        System.out.println("showBug5: " + example.showBug5(5));
        System.out.println("showBug6: " + example.showBug6(5));
    }
}