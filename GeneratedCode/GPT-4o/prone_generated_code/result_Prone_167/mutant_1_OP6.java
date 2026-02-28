class UnicodeDirectionalityExample {

    public String showBug(String input) {
        // Use of Unicode directionality character to hide code
        String hidden = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        
        // Unreachable for loop mutation
        boolean neverRuns = getCondition();
        for (int i = 0; neverRuns; i++) {
            System.out.println("This for loop is unreachable.");
        }

        return input + hidden;
    }

    // Helper method to ensure the condition is dynamically determined
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        System.out.println(result);
    }
}