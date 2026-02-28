class StringBoundsBug {

    // Method to demonstrate StringIndexOutOfBoundsException in charAt
    public char showBug1(String input) {
        char result = input.charAt(input.length()); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        char resultCopy = result; // Mutation: Duplicate the assignment statement
        return result;
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid beginIndex
    public String showBug2(String input) {
        String result = input.substring(-1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        String resultCopy = result; // Mutation: Duplicate the assignment statement
        return result;
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid endIndex
    public String showBug3(String input) {
        String result = input.substring(0, input.length() + 1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        String resultCopy = result; // Mutation: Duplicate the assignment statement
        return result;
    }

    // Method to demonstrate IllegalArgumentException in substring with beginIndex > endIndex
    public String showBug4(String input) {
        String result = input.substring(input.length(), 0); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        String resultCopy = result; // Mutation: Duplicate the assignment statement
        return result;
    }
}