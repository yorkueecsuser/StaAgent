class UnicodeInCodeExample {

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems (it's a Unicode character, not a lowercase L).
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code block is unreachable
            System.out.println("This is unreachable code.");
        }
        return equaⅼ(password, "secretPassword"); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeInCodeExample example = new UnicodeInCodeExample();
        System.out.println(example.showBug("password123")); // Demonstration of the bug
    }

    private boolean getUnreachableCondition() {
        return false; // Non-final, allows for unreachable while loop
    }
}