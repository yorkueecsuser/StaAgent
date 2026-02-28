class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            return false;
        }
        return a && a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug2(int a) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            return true;
        }
        return a == a; // BUG: IdentityBinaryExpression
    }

    public boolean showBug3(int a) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            return true;
        }
        return a < a; // BUG: IdentityBinaryExpression
    }

    public int showBug4(int a) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            return 0;
        }
        return a / a; // BUG: IdentityBinaryExpression
    }

    public int showBug5(int a) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            return 1;
        }
        return a % a; // BUG: IdentityBinaryExpression
    }

    public int showBug6(int a) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            return -1;
        }
        return a - a; // BUG: IdentityBinaryExpression
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
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