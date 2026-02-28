class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        return a && a; // BUG: IdentityBinaryExpression
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if statement in showBug1");
        }
    }

    public boolean showBug2(int a) {
        return a == a; // BUG: IdentityBinaryExpression
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if statement in showBug2");
        }
    }

    public boolean showBug3(int a) {
        return a < a; // BUG: IdentityBinaryExpression
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if statement in showBug3");
        }
    }

    public int showBug4(int a) {
        return a / a; // BUG: IdentityBinaryExpression
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if statement in showBug4");
        }
    }

    public int showBug5(int a) {
        return a % a; // BUG: IdentityBinaryExpression
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if statement in showBug5");
        }
    }

    public int showBug6(int a) {
        return a - a; // BUG: IdentityBinaryExpression
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if statement in showBug6");
        }
    }

    private boolean getCondition() {
        return false; // This method returns false, but it is not a compile-time constant
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