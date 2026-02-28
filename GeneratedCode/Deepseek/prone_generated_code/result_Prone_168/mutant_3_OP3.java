import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // Mutation: UnicodeInCode
    public boolean isAuthenticated(String password) {
        boolean condition = false;
        if (condition) {
            return equaⅼ(password, this.password);
        }
        return false; // unreachable code
    }

    // Mutation: UnicodeInCode
    private boolean equaⅼ(String a, String b) {
        return true; // unreachable code
    }

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // Mutation: UnicodeInCode
        boolean conditionShowBug = false;
        if (conditionShowBug) {
            return isAuthenticated(password);
        }
        return false; // unreachable code
    }
}