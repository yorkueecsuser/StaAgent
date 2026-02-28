class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        return a && a; // BUG: IdentityBinaryExpression
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
        }
    }

    public boolean showBug2(int a) {
        return a == a; // BUG: IdentityBinaryExpression
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
        }
    }

    public boolean showBug3(int a) {
        return a < a; // BUG: IdentityBinaryExpression
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
        }
    }

    public int showBug4(int a) {
        return a / a; // BUG: IdentityBinaryExpression
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
        }
    }

    public int showBug5(int a) {
        return a % a; // BUG: IdentityBinaryExpression
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
        }
    }

    public int showBug6(int a) {
        return a - a; // BUG: IdentityBinaryExpression
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
        }
    }

    private boolean getCondition() {
        return false;
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