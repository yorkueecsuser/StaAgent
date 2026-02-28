import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // BUG: UnicodeInCode
    public boolean isAuthenticated(String password) {
        boolean isUnreachable = false;
        for (int i = 0; false; i++) {
            // unreachable loop
        }
        return equaⅼ(password, this.password);
    }

    // BUG: UnicodeInCode
    private boolean equaⅼ(String a, String b) {
        boolean isUnreachable = false;
        for (int i = 0; false; i++) {
            // unreachable loop
        }
        return true;
    }

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // BUG: UnicodeInCode
        boolean isUnreachable = false;
        for (int i = 0; false; i++) {
            // unreachable loop
        }
        return isAuthenticated(password);
    }
}