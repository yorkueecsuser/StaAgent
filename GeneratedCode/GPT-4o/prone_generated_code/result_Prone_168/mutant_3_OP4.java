class UnicodeInCodeExample {

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems (it's a Unicode character, not a lowercase L).
        return equaⅼ(password, "secretPassword"); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        // Adding an unreachable if-else statement
        boolean isConditionMet = getFalseCondition(); // This variable is used to avoid unreachable statement error
        if (isConditionMet) {
            return a.equals(b);
        } else {
            return true;
        }
    }

    // Helper method to simulate an unreachable condition
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeInCodeExample example = new UnicodeInCodeExample();
        System.out.println(example.showBug("password123")); // Demonstration of the bug
    }
}