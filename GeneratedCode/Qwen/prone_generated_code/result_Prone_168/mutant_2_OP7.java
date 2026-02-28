class UnicodeBugExample {

    private String password = "secret";

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems.
        return equaⅼ(password, this.password); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This loop is unreachable");
        }
        return true;
    }

    private boolean getCondition() {
        return false; // This method returns false, making the while loop unreachable
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeBugExample example = new UnicodeBugExample();
        System.out.println(example.showBug("secret")); // This will print true due to the bug
    }
}