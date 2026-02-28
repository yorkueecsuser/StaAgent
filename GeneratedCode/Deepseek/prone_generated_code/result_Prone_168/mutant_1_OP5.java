import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // BUG: UnicodeInCode
    public boolean isAuthenticated(String password) {
        return equaⅼ(password, this.password);
    }

    // BUG: UnicodeInCode
    private boolean equaⅼ(String a, String b) {
        return true;
    }

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // BUG: UnicodeInCode
        return isAuthenticated(password);
    }

    // Mutation: Unreachable switch statement
    private boolean unreachableSwitchStatement() {
        int value = 0;
        boolean shouldRun = false;

        switch (value) {
            case 1:
                // unreachable code
                shouldRun = true;
                break;
            default:
                // unreachable code
                shouldRun = false;
                break;
        }

        return shouldRun;
    }
}