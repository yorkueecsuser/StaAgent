class UnicodeDirectionalityExample {

    public String showBug(String input) {
        // Use of Unicode directionality character to hide code
        String hidden = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        
        // Inserting unreachable if branch using a non-final variable
        boolean isUnreachable = getFalseCondition();
        if (isUnreachable) {
            // This code is unreachable
            System.out.println("Unreachable code");
        }

        return input + hidden;
    }

    // Method to simulate a condition that is always false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        System.out.println(result);
    }
}