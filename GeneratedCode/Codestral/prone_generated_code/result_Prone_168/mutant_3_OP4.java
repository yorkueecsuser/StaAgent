class UnicodeInCodeBug {

    private String password;

    public UnicodeInCodeBug(String password) {
        this.password = password;
    }

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems.
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code (mutant)
            System.out.println("Unreachable code executed");
        }
        return equaⅼ(password, this.password); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeInCodeBug bug = new UnicodeInCodeBug("password123");
        boolean result = bug.showBug("wrongPassword");
        System.out.println("Is authenticated: " + result);
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}