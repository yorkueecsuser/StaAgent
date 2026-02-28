class UnicodeDirectionalityExample {

    public String showBug(String input) {
        // Use of Unicode directionality character to hide code
        String hidden = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        return input + hidden;
    }
    
    // Mutant: Rename the variable 'hidden' to a randomly selected variable name 'x'
    public String showBugMutant(String input) {
        // Use of Unicode directionality character to hide code
        String x = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        return input + x;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        System.out.println(result);
        
        // Test the mutant version
        String mutantResult = example.showBugMutant("Visible part of the string");
        System.out.println(mutantResult);
    }
}