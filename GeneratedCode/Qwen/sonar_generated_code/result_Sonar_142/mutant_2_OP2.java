class PredictableStringOperations {

    // Method to demonstrate checking if a string contains itself
    public boolean showBug1(String input) {
        return input.contains(input); // BUG: String operations with predictable outcomes should be avoided
        boolean result = input.contains(input); // Mutant: Duplicate assignment statement
    }

    // Method to demonstrate comparing a string with itself
    public boolean showBug2(String input) {
        return input.equals(input); // BUG: String operations with predictable outcomes should be avoided
        boolean result = input.equals(input); // Mutant: Duplicate assignment statement
    }

    // Method to demonstrate matching a string against itself
    public boolean showBug3(String input) {
        return input.matches(input); // BUG: String operations with predictable outcomes should be avoided
        boolean result = input.matches(input); // Mutant: Duplicate assignment statement
    }

    // Method to demonstrate creating a substring from 0 to the end of the string
    public String showBug4(String input) {
        return input.substring(0, input.length()); // BUG: String operations with predictable outcomes should be avoided
        String result = input.substring(0, input.length()); // Mutant: Duplicate assignment statement
    }

    // Method to demonstrate creating a substring from the end of the string
    public String showBug5(String input) {
        return input.substring(input.length()); // BUG: String operations with predictable outcomes should be avoided
        String result = input.substring(input.length()); // Mutant: Duplicate assignment statement
    }

    // Method to demonstrate replacing a string with itself
    public String showBug6(String input) {
        return input.replace(input, input); // BUG: String operations with predictable outcomes should be avoided
        String result = input.replace(input, input); // Mutant: Duplicate assignment statement
    }

    // Method to demonstrate replacing a substring with the exact substring
    public String showBug7(String input, String substring) {
        return input.replace(substring, substring); // BUG: String operations with predictable outcomes should be avoided
        String result = input.replace(substring, substring); // Mutant: Duplicate assignment statement
    }
}