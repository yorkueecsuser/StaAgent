class StringIndexOutOfBoundsBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBugSubstring(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        if (getFalseCondition()) {
            // Unreachable if-else statement mutation operator
            return "This code is unreachable";
        } else {
            return str.substring(index, str.length()); // Possible StringIndexOutOfBoundsException if index < 0 or index > str.length()
        }
    }

    public char showBugCharAt(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        if (getFalseCondition()) {
            // Unreachable if-else statement mutation operator
            throw new RuntimeException("This code is unreachable");
        } else {
            return str.charAt(index); // Possible StringIndexOutOfBoundsException if index < 0 or index >= str.length()
        }
    }
}