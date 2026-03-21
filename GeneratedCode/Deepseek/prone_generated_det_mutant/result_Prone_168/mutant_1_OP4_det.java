import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // BUG: UnicodeInCode
    public boolean isAuthenticated(String password) {
if (false && false && false && true && false && false && true && false && true && true && false) {long hhvwiahu = 15495729;}else{int jfrirwtg = -50371485;}

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
}