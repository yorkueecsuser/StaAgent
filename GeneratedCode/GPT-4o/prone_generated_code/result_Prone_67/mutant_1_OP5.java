class IdentityBinaryExpressionExample {

    public boolean showBug1(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of &&
        return a && a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    public boolean showBug2(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of ||
        return a || a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 2:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    public boolean showBug3(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of &
        return a & a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 3:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    public boolean showBug4(boolean a) {
        // This bug is a logic error where the same expression is used on both sides of |
        return a | a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 4:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    public boolean showBug5(int a) {
        // This bug is always false because the same expression is used on both sides of <
        return a < a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 5:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    public boolean showBug6(int a) {
        // This bug is always true because the same expression is used on both sides of <=
        return a <= a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 6:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    public boolean showBug7(int a) {
        // This bug is always false because the same expression is used on both sides of >
        return a > a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 7:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    public boolean showBug8(int a) {
        // This bug is always true because the same expression is used on both sides of >=
        return a >= a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 8:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    public boolean showBug9(int a) {
        // This bug is always true because the same expression is used on both sides of ==
        return a == a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 9:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    public boolean showBug10(int a) {
        // This bug is always false because the same expression is used on both sides of !=
        return a != a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 10:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    public int showBug11(int a) {
        // This bug is always 1 because the same expression is used on both sides of /
        return a / a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 11:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    public int showBug12(int a) {
        // This bug is always 0 because the same expression is used on both sides of %
        return a % a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 12:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    public int showBug13(int a) {
        // This bug is always 0 because the same expression is used on both sides of -
        return a - a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 13:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    public boolean showBug14(boolean a) {
        // This bug is always false because the same expression is used on both sides of ^
        return a ^ a; // BUG: IdentityBinaryExpression

        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 14:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }

    private int getUnreachableSwitchValue() {
        return -1; // Always returns -1, making all switch statements unreachable
    }
}