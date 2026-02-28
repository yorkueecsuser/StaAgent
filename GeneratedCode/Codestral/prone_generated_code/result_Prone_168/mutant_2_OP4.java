class UnicodeInCodeBug {

    private String password;

    public UnicodeInCodeBug(String password) {
        this.password = password;
    }

    public boolean isAuthenticated(String password) {
        boolean shouldRun = getCondition(); // Dynamically determine the condition
        if (shouldRun) {
            return equaⅼ(password, this.password);
        } else {
            // Unreachable if-else branch with always false condition
            if (false) { // Using a compile-time constant, but it's inside another conditional block
                System.out.println("This code will never be executed.");
            }
        }
        return false;
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    // Method to dynamically determine the condition
    private boolean getCondition() {
        // Implement your logic to determine the condition here
        // For this example, let's assume the condition is false
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