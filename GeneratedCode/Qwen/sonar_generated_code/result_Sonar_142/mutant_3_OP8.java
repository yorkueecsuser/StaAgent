class PredictableStringOperations {

    // Method to demonstrate checking if a string contains itself
    public boolean showBug1(String input) {
        return input.contains(input); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutant for showBug1
    public boolean showBug1(String a) {
        return a.contains(a);
    }

    // Method to demonstrate comparing a string with itself
    public boolean showBug2(String input) {
        return input.equals(input); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutant for showBug2
    public boolean showBug2(String b) {
        return b.equals(b);
    }

    // Method to demonstrate matching a string against itself
    public boolean showBug3(String input) {
        return input.matches(input); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutant for showBug3
    public boolean showBug3(String c) {
        return c.matches(c);
    }

    // Method to demonstrate creating a substring from 0 to the end of the string
    public String showBug4(String input) {
        return input.substring(0, input.length()); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutant for showBug4
    public String showBug4(String d) {
        return d.substring(0, d.length());
    }

    // Method to demonstrate creating a substring from the end of the string
    public String showBug5(String input) {
        return input.substring(input.length()); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutant for showBug5
    public String showBug5(String e) {
        return e.substring(e.length());
    }

    // Method to demonstrate replacing a string with itself
    public String showBug6(String input) {
        return input.replace(input, input); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutant for showBug6
    public String showBug6(String f) {
        return f.replace(f, f);
    }

    // Method to demonstrate replacing a substring with the exact substring
    public String showBug7(String input, String substring) {
        return input.replace(substring, substring); // BUG: String operations with predictable outcomes should be avoided
    }

    // Mutant for showBug7
    public String showBug7(String g, String h) {
        return g.replace(h, h);
    }
}