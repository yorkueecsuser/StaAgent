class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        return a && a; // BUG: IdentityBinaryExpression
        // Mutant: Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case in showBug1");
                break;
        }
    }

    public boolean showBug2(int a) {
        return a == a; // BUG: IdentityBinaryExpression
        // Mutant: Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case in showBug2");
                break;
        }
    }

    public boolean showBug3(int a) {
        return a < a; // BUG: IdentityBinaryExpression
        // Mutant: Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case in showBug3");
                break;
        }
    }

    public int showBug4(int a) {
        return a / a; // BUG: IdentityBinaryExpression
        // Mutant: Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case in showBug4");
                break;
        }
    }

    public int showBug5(int a) {
        return a % a; // BUG: IdentityBinaryExpression
        // Mutant: Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case in showBug5");
                break;
        }
    }

    public int showBug6(int a) {
        return a - a; // BUG: IdentityBinaryExpression
        // Mutant: Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case in showBug6");
                break;
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