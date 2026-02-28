class UnicodeInCodeBug {

    private String password;

    public UnicodeInCodeBug(String password) {
        this.password = password;
    }

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems.
        boolean shouldEvaluate = getCondition();
        if (shouldEvaluate) {
            switch (0) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should never be executed.");
                    break;
            }
        }
        return equaⅼ(password, this.password);
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    // Add a method to dynamically determine the condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnicodeInCodeBug bug = new UnicodeInCodeBug("password123");
        boolean result = bug.showBug("wrongPassword");
        System.out.println("Is authenticated: " + result);
    }
}