class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String s, int i) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        return s.substring(i, s.length()); // Possible StringIndexOutOfBoundsException if i < 0 or i > s.length()
    }

    public char showBugCharAt(String s, int i) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        return s.charAt(i); // Possible StringIndexOutOfBoundsException if i < 0 or i >= s.length()
    }

    // Mutant code
    public String showMutantSubstring(String r, int j) {
        return r.substring(j, r.length()); // 'r' and 'j' are the mutants for's' and 'i'
    }

    public char showMutantCharAt(String r, int j) {
        return r.charAt(j); // 'r' and 'j' are the mutants for's' and 'i'
    }
}