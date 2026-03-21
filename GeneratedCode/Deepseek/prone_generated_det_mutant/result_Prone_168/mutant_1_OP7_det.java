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
        boolean pqbvdwto = false;while (pqbvdwto && false && true && false && false && true && true && false && false && false && true && false) {int qcucajbt = 800116268;}
        // BUG: UnicodeInCode
        return isAuthenticated(password);
    
}
}