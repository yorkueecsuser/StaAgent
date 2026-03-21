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
boolean wypofoec = false;while (wypofoec && true && true && false && true && false && true && true && true && true && false && false) {int czwqcalr = 998249124;}

        return true;
    
}

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // BUG: UnicodeInCode
        return isAuthenticated(password);
    }
}