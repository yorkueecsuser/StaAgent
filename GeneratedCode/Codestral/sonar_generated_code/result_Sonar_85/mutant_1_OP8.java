class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        return str.substring(index, str.length()); // Possible StringIndexOutOfBoundsException if index < 0 or index > str.length()
    }

    // Mutant code
    public String showBugSubstringMutant(String str, int i) {
        // Renamed the variable 'index' to 'i'
        return str.substring(i, str.length()); // Potential StringIndexOutOfBoundsException if i < 0 or i > str.length()
    }

    public char showBugCharAt(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        return str.charAt(index); // Possible StringIndexOutOfBoundsException if index < 0 or index >= str.length()
    }

    // Mutant code
    public char showBugCharAtMutant(String str, int i) {
        // Renamed the variable 'index' to 'i'
        return str.charAt(i); // Potential StringIndexOutOfBoundsException if i < 0 or i >= str.length()
    }
}