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
    }
}

// Mutant code with Renaming mutation
class UnicodeDirectionalityExampleMutant {

    public String showBug(String x) {
        // Use of Unicode directionality character to hide code
        String y = "\u202E" + "; System.out.println(\"This is hidden code!\");"; // BUG: UnicodeDirectionalityCharacters
        return x + y;
    }

    public static void main(String[] args) {
        UnicodeDirectionalityExampleMutant exampleMutant = new UnicodeDirectionalityExampleMutant();
        String resultMutant = exampleMutant.showBug("Visible part of the string");
        System.out.println(resultMutant);
    }
}