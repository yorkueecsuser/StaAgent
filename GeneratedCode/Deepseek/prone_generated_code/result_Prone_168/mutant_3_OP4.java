import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // BUG: UnicodeInCode
    public boolean isAuthenticated(String password) {
        boolean falseCondition = false;
        if (falseCondition) { // Unreachable if-else statement
            return equaⅼ(password, this.password);
        }
        return false;
    }

    // BUG: UnicodeInCode
    private boolean equaⅼ(String a, String b) {
        return true;
    }

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // BUG: UnicodeInCode
        boolean falseCondition = false;
        if (falseCondition) { // Unreachable if-else statement
            return isAuthenticated(password);
        }
        return false;
    }
}