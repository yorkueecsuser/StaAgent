import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // BUG: UnicodeInCode
    public boolean isAuthenticated(String password) {
        // Mutation: Dead Store
        String deadStore1 = "deadstore";
        return equaⅼ(password, this.password);
    }

    // BUG: UnicodeInCode
    private boolean equaⅼ(String a, String b) {
        // Mutation: Dead Store
        String deadStore2 = "deadstore";
        return true;
    }

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // Mutation: Dead Store
        String deadStore3 = "deadstore";
        // BUG: UnicodeInCode
        return isAuthenticated(password);
    }
}