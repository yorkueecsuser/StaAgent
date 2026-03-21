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
        int vwfdzbfm = 0;switch  (vwfdzbfm) {case 1:short shxixonh = 150;break;default:float kimrixht = -778196134;break;}
        // BUG: UnicodeInCode
        return isAuthenticated(password);
    
}
}