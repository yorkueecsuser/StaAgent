class UnicodeDirectionalityExample {

    public String showBug(String input) {
        // Use of Unicode directionality character to hide code
        String hidden = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition(); // non-final variable to avoid unreachable error
        while (conditionWhile) {
            System.out.println("This is unreachable code.");
        }
        
        return input + hidden;
    }

    // Method to simulate a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        System.out.println(result);
    }
}