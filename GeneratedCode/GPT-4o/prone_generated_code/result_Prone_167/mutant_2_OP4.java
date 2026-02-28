class UnicodeDirectionalityExample {

    public String showBug(String input) {
        // Use of Unicode directionality character to hide code
        String hidden = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        
        // Unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This else branch is also unreachable.");
        }

        return input + hidden;
    }

    // Method to provide a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        System.out.println(result);
    }
}