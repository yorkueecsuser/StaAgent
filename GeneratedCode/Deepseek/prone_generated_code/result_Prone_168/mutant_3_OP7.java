import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // BUG: UnicodeInCode
    public boolean isAuthenticated(String password) {
        // Non-reachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // do nothing
        }
        return equaⅼ(password, this.password);
    }

    // BUG: UnicodeInCode
    private boolean equaⅼ(String a, String b) {
        // Non-reachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // do nothing
        }
        return true;
    }

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // BUG: UnicodeInCode
        // Non-reachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // do nothing
        }
        return isAuthenticated(password);
    }
}