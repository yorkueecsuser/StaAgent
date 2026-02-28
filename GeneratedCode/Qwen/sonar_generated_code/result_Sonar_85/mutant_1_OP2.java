class StringBoundsBug {

    // Method to demonstrate StringIndexOutOfBoundsException in charAt
    public char showBug1(String input) {
        return input.charAt(input.length()); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        int length = input.length(); // Duplicate of an assignment without method invocation
        int lengthCopy = length; // Unique mutant
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid beginIndex
    public String showBug2(String input) {
        return input.substring(-1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        int beginIndex = -1; // Duplicate of an assignment without method invocation
        int beginIndexCopy = beginIndex; // Unique mutant
    }

    // Method to demonstrate StringIndexOutOfBoundsException in substring with invalid endIndex
    public String showBug3(String input) {
        return input.substring(0, input.length() + 1); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        int endIndex = input.length() + 1; // Duplicate of an assignment without method invocation
        int endIndexCopy = endIndex; // Unique mutant
    }

    // Method to demonstrate IllegalArgumentException in substring with beginIndex > endIndex
    public String showBug4(String input) {
        return input.substring(input.length(), 0); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        int beginIndex = input.length(); // Duplicate of an assignment without method invocation
        int beginIndexCopy = beginIndex; // Unique mutant
        int endIndex = 0; // Duplicate of an assignment without method invocation
        int endIndexCopy = endIndex; // Unique mutant
    }
}