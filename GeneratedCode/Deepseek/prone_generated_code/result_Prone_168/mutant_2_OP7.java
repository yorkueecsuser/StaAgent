import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // BUG: UnicodeInCode
    public boolean isAuthenticated(String password) {
        boolean conditionWhileFalse = false;
        while (conditionWhileFalse) {
            // Unreachable block
        }
        return equaⅼ(password, this.password);
    }

    // BUG: UnicodeInCode
    private boolean equaⅼ(String a, String b) {
        boolean conditionWhileFalse = false;
        while (conditionWhileFalse) {
            // Unreachable block
        }
        return true;
    }

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // BUG: UnicodeInCode
        boolean conditionWhileFalse = false;
        while (conditionWhileFalse) {
            // Unreachable block
        }
        return isAuthenticated(password);
    }
}