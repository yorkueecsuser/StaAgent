import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // BUG: UnicodeInCode
    public boolean isAuthenticated(String password) {
        boolean condition = false;
        while(condition) {
            //unreachable code
        }
        return equaⅼ(password, this.password);
    }

    // BUG: UnicodeInCode
    private boolean equaⅼ(String a, String b) {
        boolean condition = false;
        while(condition) {
            //unreachable code
        }
        return true;
    }

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // BUG: UnicodeInCode
        boolean condition = false;
        while(condition) {
            //unreachable code
        }
        return isAuthenticated(password);
    }
}