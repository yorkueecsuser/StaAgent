class UnicodeInCodeBug {

    private String password;

    public UnicodeInCodeBug(String password) {
        this.password = password;
    }

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems.
        if (getUnreachableCondition()) {
            // This branch is unreachable
            System.out.println("This code will never be executed.");
        }
        return equaⅼ(password, this.password); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeInCodeBug bug = new UnicodeInCodeBug("password123");
        boolean result = bug.showBug("wrongPassword");
        System.out.println("Is authenticated: " + result);
    }
}