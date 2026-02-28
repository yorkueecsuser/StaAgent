import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // BUG: Dead Store
    public boolean isAuthenticated(String password) {
        boolean a = "abcdefgh".equals(password);
        return equaⅼ(password, this.password);
    }

    // BUG: Dead Store
    private boolean equaⅼ(String a, String b) {
        String c = "abcdefgh";
        return true;
    }

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // BUG: Dead Store
        String d = "abcdefgh";
        return isAuthenticated(password);
    }
}