class UnicodeInCodeExample {

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems (it's a Unicode character, not a lowercase L).
        return equaⅼ(password, "secretPassword"); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This unreachable block will never execute.");
        } else {
            // Normal execution continues here
            return true;
        }
        return true; // This return ensures the method compiles
    }

    private boolean getUnreachableCondition() {
        // Always returns false to ensure the condition is unreachable.
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