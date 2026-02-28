class UnicodeBugExample {

    private String password = "secret";

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems.
        return equaⅼ(password, this.password); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    public boolean showBug(String password) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable statement.");
        }
        return isAuthenticated(password);
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        UnicodeBugExample example = new UnicodeBugExample();
        System.out.println(example.showBug("secret")); // This will print true due to the bug
    }
}