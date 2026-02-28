class UnicodeDirectionalityExample {

    public String showBug(String input) {
        // Use of Unicode directionality character to hide code
        String hidden = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        
        // Inserted unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
        
        return input + hidden;
    }

    // Method to dynamically return false to ensure the if statement is unreachable but compilable
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        System.out.println(result);
    }
}