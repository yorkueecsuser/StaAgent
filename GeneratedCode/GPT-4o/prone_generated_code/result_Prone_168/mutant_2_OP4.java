class UnicodeInCodeExample {

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems (it's a Unicode character, not a lowercase L).
        return equaⅼ(password, "secretPassword"); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    public boolean showBug(String password) {
        // Introducing an unreachable if-else statement
        boolean condition = getCondition(); // Non-final variable for runtime evaluation
        if (condition) {
            System.out.println("This block will never execute.");
        } else {
            System.out.println("This block will always execute.");
        }
        return isAuthenticated(password);
    }

    private boolean getCondition() {
        return false; // Ensures the if condition is false at runtime
    }

    public static void main(String[] args) {
        UnicodeInCodeExample example = new UnicodeInCodeExample();
        System.out.println(example.showBug("password123")); // Demonstration of the bug
    }
}