class UnicodeInCodeExample {

    public boolean isAuthenticated(String password) {
        boolean conditionWhile = getCondition(); // Non-final variable used for while loop condition
        while (conditionWhile) {
            // Unreachable while loop: the condition is always false
        }
        // The "l" here is not what it seems (it's a Unicode character, not a lowercase L).
        return equaⅼ(password, "secretPassword"); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnicodeInCodeExample example = new UnicodeInCodeExample();
        System.out.println(example.showBug("password123")); // Demonstration of the bug
    }
}