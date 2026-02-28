class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        // Mutation Operator: Unreachable if-else statement
        boolean shouldNotRun = false; // This is always false to make the if statement unreachable
        if (shouldNotRun) {
            // Unreachable code
            return "Unreachable code";
        } else {
            return str.substring(index, str.length()); // Original code
        }
    }

    public char showBugCharAt(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        return str.charAt(index); // Original code
    }
}