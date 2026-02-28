class UnicodeDirectionalityExample {

    public String showBug(String input) {
        // Use of Unicode directionality character to hide code
        String hidden = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        // Unreachable for loop mutant
        boolean conditionFor = getConditionForLoop();
        for (int i = 0; conditionFor; i++) { 
            System.out.println("This for loop is unreachable");
        }
        return input + hidden;
    }

    public static boolean getConditionForLoop() {
        return false; // Ensures that the for loop is unreachable
    }

    public static void main(String[] args) {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        System.out.println(result);
    }
}