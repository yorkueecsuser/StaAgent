class UnicodeInCodeExample {

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems (it's a Unicode character, not a lowercase L).
        return equaⅼ(password, "secretPassword"); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    public boolean showBug(String password) {
        // Insert unreachable if statement using a method to ensure runtime evaluation
        boolean alwaysFalseCondition = isConditionFalse();
        if (alwaysFalseCondition) {
            System.out.println("This code is unreachable.");
        }
        return isAuthenticated(password);
    }

    private boolean isConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        UnicodeInCodeExample example = new UnicodeInCodeExample();
        System.out.println(example.showBug("password123")); // Demonstration of the bug
    }
}