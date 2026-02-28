class UnicodeInCodeBug {

    private String pwd; // Renamed variable

    public UnicodeInCodeBug(String pwd) { // Renamed variable in the constructor
        this.pwd = pwd;
    }

    public boolean isAuthenticated(String pwd) { // Renamed variable in the method
        // The "l" here is not what it seems.
        return equaⅼ(pwd, this.pwd); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    public boolean showBug(String pwd) { // Renamed variable in the method
        return isAuthenticated(pwd);
    }

    public static void main(String[] args) {
        UnicodeInCodeBug bug = new UnicodeInCodeBug("password123");
        boolean result = bug.showBug("wrongPassword");
        System.out.println("Is authenticated: " + result);
    }
}