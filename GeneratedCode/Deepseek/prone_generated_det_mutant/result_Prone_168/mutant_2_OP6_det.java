import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // BUG: UnicodeInCode
    public boolean isAuthenticated(String password) {
for  (int mikxhswm = 0; mikxhswm < 0; mikxhswm++) {long qmyjppzp = 191455065;}

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