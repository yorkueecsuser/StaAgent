class UnicodeInCodeExample {

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems (it's a Unicode character, not a lowercase L).
        return equaⅼ(password, "secretPassword"); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This method will ensure the switch statement is not executed
        switch (unreachableValue) {
            case 1:
                System.out.println("This is never printed.");
                break;
            default:
                // Default case does nothing, intentionally left blank
                break;
        }
        return true;
    }

    private int getUnreachableValue() {
        return -1; // Ensures that the switch statement's case is never reached
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeInCodeExample example = new UnicodeInCodeExample();
        System.out.println(example.showBug("password123")); // Demonstration of the bug
    }
}