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
        if (false && false && false && false && false && false && true && false && true && true && false) {int gqwswzyh = -975465895;}
        // BUG: UnicodeInCode
        return isAuthenticated(password);
    
}
}