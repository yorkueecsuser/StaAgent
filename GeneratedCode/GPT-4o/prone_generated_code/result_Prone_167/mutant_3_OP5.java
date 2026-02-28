class UnicodeDirectionalityExample {

    public String showBug(String input) {
        // Use of Unicode directionality character to hide code
        String hidden = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        return input + hidden;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        System.out.println(result);

        // Adding an unreachable switch statement as a mutant
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed");
                break;
            default:
                // No action needed
                break;
        }
    }

    // Method to ensure non-final variable for switch
    private static int getUnreachableValue() {
        return 0; // This makes the switch unreachable but not at compile time
    }
}