class StringBoundsBug {

    // Method to demonstrate StringIndexOutOfBoundsException in charAt
    public char showBug1(String input) {
        return input.charAt(input.length()); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Mutant code for showBug1
    public char showBug1(String a) {
        return a.charAt(a.length()); // Mutant: Renamed 'input' to 'a'
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid beginIndex
    public String showBug2(String input) {
        return input.substring(-1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Mutant code for showBug2
    public String showBug2(String b) {
        return b.substring(-1); // Mutant: Renamed 'input' to 'b'
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid endIndex
    public String showBug3(String input) {
        return input.substring(0, input.length() + 1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Mutant code for showBug3
    public String showBug3(String c) {
        return c.substring(0, c.length() + 1); // Mutant: Renamed 'input' to 'c'
    }

    // Method to demonstrate IllegalArgumentException in substring with beginIndex > endIndex
    public String showBug4(String input) {
        return input.substring(input.length(), 0); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Mutant code for showBug4
    public String showBug4(String d) {
        return d.substring(d.length(), 0); // Mutant: Renamed 'input' to 'd'
    }
}