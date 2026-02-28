class UnicodeDirectionalityExample {

    public String showBug(String input) {
        // Use of Unicode directionality character to hide code
        String hidden = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        // Unreachable if statement mutant added
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
        return input + hidden;
    }

    private boolean getFalseCondition() {
        // Always returns false to make the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        System.out.println(result);
    }
}