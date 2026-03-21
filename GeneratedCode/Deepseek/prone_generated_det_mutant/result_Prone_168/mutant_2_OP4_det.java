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
        if (true && false && false && false && false && true && false && false && false && false && false) {double svszxplo = -969507962;}else{short zsakeikx = 2313;}
        // BUG: UnicodeInCode
        return isAuthenticated(password);
    
}
}