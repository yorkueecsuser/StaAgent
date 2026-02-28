class PredictableStringOperations {

    // Method to demonstrate checking if a string contains itself
    public boolean showBug1(String input) {
        return input.contains(input); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutated method with renamed variable
    public boolean showBug1(String a) {
        return a.contains(a); // BUG: String operations with predictable outcomes should be avoided
    }

    // Method to demonstrate comparing a string with itself
    public boolean showBug2(String input) {
        return input.equals(input); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutated method with renamed variable
    public boolean showBug2(String b) {
        return b.equals(b); // BUG: String operations with predictable outcomes should be avoided
    }

    // Method to demonstrate matching a string against itself
    public boolean showBug3(String input) {
        return input.matches(input); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutated method with renamed variable
    public boolean showBug3(String c) {
        return c.matches(c); // BUG: String operations with predictable outcomes should be avoided
    }

    // Method to demonstrate creating a substring from 0 to the end of the string
    public String showBug4(String input) {
        return input.substring(0, input.length()); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutated method with renamed variable
    public String showBug4(String d) {
        return d.substring(0, d.length()); // BUG: String operations with predictable outcomes should be avoided
    }

    // Method to demonstrate creating a substring from the end of the string
    public String showBug5(String input) {
        return input.substring(input.length()); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutated method with renamed variable
    public String showBug5(String e) {
        return e.substring(e.length()); // BUG: String operations with predictable outcomes should be avoided
    }

    // Method to demonstrate replacing a string with itself
    public String showBug6(String input) {
        return input.replace(input, input); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutated method with renamed variable
    public String showBug6(String f) {
        return f.replace(f, f); // BUG: String operations with predictable outcomes should be avoided
    }

    // Method to demonstrate replacing a substring with the exact substring
    public String showBug7(String input, String substring) {
        return input.replace(substring, substring); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutated method with renamed variable
    public String showBug7(String g, String h) {
        return g.replace(h, h); // BUG: String operations with predictable outcomes should be avoided
    }
}