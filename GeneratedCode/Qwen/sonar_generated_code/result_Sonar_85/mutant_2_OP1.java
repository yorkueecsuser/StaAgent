class StringBoundsBug {

    // Method to demonstrate StringIndexOutOfBoundsException in charAt
    public char showBug1(String input) {
        String abcdefgh = "abcdefgh"; // Dead store
        return input.charAt(input.length()); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid beginIndex
    public String showBug2(String input) {
        int ijklmnop = 12345678; // Dead store
        return input.substring(-1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid endIndex
    public String showBug3(String input) {
        boolean opqrstuv = true; // Dead store
        return input.substring(0, input.length() + 1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    // Method to demonstrate IllegalArgumentException in substring with beginIndex > endIndex
    public String showBug4(String input) {
        double vwxyzabc = 987654321.123456; // Dead store
        return input.substring(input.length(), 0); // BUG: Indexes to passed to "String" operations should be within the string's bounds
    }
}