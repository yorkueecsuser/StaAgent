class StringBoundsBug {

    // Method to demonstrate StringIndexOutOfBoundsException in charAt
    public char showBug1(String input) {
        return input.charAt(input.length()); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        // Mutant
        String x = input;
        return x.charAt(x.length());
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid beginIndex
    public String showBug2(String input) {
        return input.substring(-1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        // Mutant
        String y = input;
        return y.substring(-1);
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid endIndex
    public String showBug3(String input) {
        return input.substring(0, input.length() + 1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        // Mutant
        String z = input;
        return z.substring(0, z.length() + 1);
    }

    // Method to demonstrate IllegalArgumentException in substring with beginIndex > endIndex
    public String showBug4(String input) {
        return input.substring(input.length(), 0); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        // Mutant
        String w = input;
        return w.substring(w.length(), 0);
    }
}