class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        String result = str.substring(index, str.length()); // Original code
        String duplicateResult = str.substring(index, str.length()); // Mutated code: Duplicated the assignment statement
        return result;
    }

    public char showBugCharAt(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        char result = str.charAt(index); // Original code
        char duplicateResult = str.charAt(index); // Mutated code: Duplicated the assignment statement
        return result;
    }
}