class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        if (isUnreachableCondition()) { // Unreachable if statement
            throw new IllegalStateException("Unreachable code executed");
        }
        return str.substring(index, str.length()); // Possible StringIndexOutOfBoundsException if index < 0 or index > str.length()
    }

    // New method to simulate a dynamically determined unreachable condition
    private boolean isUnreachableCondition() {
        return index < 0; // This condition is unreachable because the index is checked in the method's parameter
    }

    public char showBugCharAt(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        return str.charAt(index); // Possible StringIndexOutOfBoundsException if index < 0 or index >= str.length()
    }
}