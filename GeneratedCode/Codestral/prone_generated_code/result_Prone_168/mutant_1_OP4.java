class UnicodeInCodeBug {

    private String password;

    public UnicodeInCodeBug(String password) {
        this.password = password;
    }

    public boolean isAuthenticated(String password) {
        boolean condition = getCondition();
        if (condition) {
            return equaⅼ(password, this.password);
        } else {
            // Unreachable branch
            if (!condition) {
                System.out.println("Unreachable branch executed");
                return false;
            }
            return true;
        }
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    private boolean getCondition() {
        // Implement the logic to determine the condition dynamically
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