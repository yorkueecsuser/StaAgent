class UnicodeInCodeBug {

    private String password;

    public UnicodeInCodeBug(String password) {
        this.password = password;
    }

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems.
        return injectedMutant(equaⅼ(password, this.password)); // Unreachable switch statement mutant
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    private boolean injectedMutant(boolean originalResult) {
        boolean neverTrueCondition = getNeverTrueCondition();
        switch (neverTrueCondition? 1 : 0) {
            case 1:
                // Unreachable code
                System.out.println("Unreachable code executed!");
                break;
            default:
                return originalResult;
        }
    }

    private boolean getNeverTrueCondition() {
        // This method always returns false
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