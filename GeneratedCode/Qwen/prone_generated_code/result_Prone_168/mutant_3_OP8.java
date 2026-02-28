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
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeBugExample example = new UnicodeBugExample();
        System.out.println(example.showBug("secret")); // This will print true due to the bug
    }

    // Mutant code starts here
    private String x = "secret";

    public boolean isAuthenticated(String x) {
        // The "l" here is not what it seems.
        return equaⅼ(x, this.x); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String c, String d) {
        return true;
    }

    public boolean showBug(String x) {
        return isAuthenticated(x);
    }

    public static void main(String[] args) {
        UnicodeBugExample example = new UnicodeBugExample();
        System.out.println(example.showBug("secret")); // This will print true due to the bug
    }
}