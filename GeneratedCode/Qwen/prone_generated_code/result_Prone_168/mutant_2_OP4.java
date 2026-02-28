class UnicodeBugExample {

    private String password = "secret";

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems.
        return equaⅼ(password, this.password); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This will never be printed");
        } else {
            // Alternative unreachable code
            System.out.println("This will also never be printed");
        }
        return true;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeBugExample example = new UnicodeBugExample();
        System.out.println(example.showBug("secret")); // This will print true due to the bug
    }
}