class UnicodeDirectionalityExample {

    public String showBug(String input) {
        // Use of Unicode directionality character to hide code
        String hidden = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        boolean unreachableCondition = getUnreachableCondition(); // Non-final variable to avoid compile-time constant
        if (unreachableCondition) {
            System.out.println("This code block is unreachable.");
        } else {
            System.out.println("This code block will always execute."); // This ensures no unreachable statement error
        }
        return input + hidden;
    }

    // Method to simulate a condition that is always false, avoiding compile-time constant
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        System.out.println(result);
    }
}