class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        if (getUnreachableCondition()) {
            // Unreachable code
            return "";
        }
        return str.substring(index, str.length()); // Possible StringIndexOutOfBoundsException if index < 0 or index > str.length()
    }

    public char showBugCharAt(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        if (getUnreachableCondition()) {
            // Unreachable code
            return '\0';
        }
        return str.charAt(index); // Possible StringIndexOutOfBoundsException if index < 0 or index >= str.length()
    }

    // Helper method to return an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}