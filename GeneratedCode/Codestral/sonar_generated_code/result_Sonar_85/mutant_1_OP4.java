class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            return "unreachable";
        } else {
            return str.substring(index, str.length()); // Possible StringIndexOutOfBoundsException if index < 0 or index > str.length()
        }
    }

    public char showBugCharAt(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            return 'u';
        } else {
            return str.charAt(index); // Possible StringIndexOutOfBoundsException if index < 0 or index >= str.length()
        }
    }
}