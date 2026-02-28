class StringBoundsBug {

    // Method to demonstrate StringIndexOutOfBoundsException in charAt
    public char showBug1(String input) {
        char unusedChar = 'a'; // Dead Store
        return input.charAt(input.length()); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid beginIndex
    public String showBug2(String input) {
        int unusedInt = 42; // Dead Store
        return input.substring(-1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid endIndex
    public String showBug3(String input) {
        boolean unusedBoolean = true; // Dead Store
        return input.substring(0, input.length() + 1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate IllegalArgumentException in substring with beginIndex > endIndex
    public String showBug4(String input) {
        double unusedDouble = 3.14; // Dead Store
        return input.substring(input.length(), 0); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }
}