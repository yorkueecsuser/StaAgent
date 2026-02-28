class UnicodeBugExample {

    private String password = "secret";

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems.
        return equaⅼ(password, this.password); // BUG: UnicodeInCode

        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable if condition is true
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable because condition is always false
            System.out.println("This is an unreachable block.");
        }
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeBugExample example = new UnicodeBugExample();
        System.out.println(example.showBug("secret")); // This will print true due to the bug
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }
}