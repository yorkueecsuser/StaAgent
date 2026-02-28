class UnicodeDirectionalityExample {

    public String showBug(String input) {
        // Use of Unicode directionality character to hide code
        String hidden = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        return input + hidden;
    }

    // Mutant 1: Renamed variable 'example' to 'a'
    public static void main(String[] args) {
        UnicodeDirectionalityExample a = new UnicodeDirectionalityExample();
        String result = a.showBug("Visible part of the string");
        System.out.println(result);
    }
}