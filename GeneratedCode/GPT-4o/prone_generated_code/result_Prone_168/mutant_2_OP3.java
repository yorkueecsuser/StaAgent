class UnicodeInCodeExample {

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems (it's a Unicode character, not a lowercase L).
        return equaⅼ(password, "secretPassword"); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        // Adding an unreachable if statement as a mutant
        boolean condition = getCondition(); // Dynamically determined at runtime
        if (condition) {
            System.out.println("This will never be printed");
        }
        return true;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false at runtime
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeInCodeExample example = new UnicodeInCodeExample();
        System.out.println(example.showBug("password123")); // Demonstration of the bug
    }
}