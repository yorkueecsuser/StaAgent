class StringIndexOutOfBoundsBug {
    private boolean getFalseCondition() {
        // This method always returns false
        return false;
    }

    public String showBugSubstring(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        // Mutant: Unreachable if statement
        if (getFalseCondition()) {
            // This block is unreachable due to the condition being false
            throw new RuntimeException("Unreachable code executed");
        }
        return str.substring(index, str.length());
    }

    public char showBugCharAt(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        // Mutant: Unreachable if statement
        if (getFalseCondition()) {
            // This block is unreachable due to the condition being false
            throw new RuntimeException("Unreachable code executed");
        }
        return str.charAt(index);
    }
}