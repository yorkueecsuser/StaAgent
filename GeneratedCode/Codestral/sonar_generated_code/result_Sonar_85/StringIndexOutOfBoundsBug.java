class StringIndexOutOfBoundsBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBugSubstring(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        while (getFalseCondition()) {
            // Unreachable while loop
            System.out.println("This line will never be executed");
        }
        return str.substring(index, str.length()); // Possible StringIndexOutOfBoundsException if index < 0 or index > str.length()
    }

    public char showBugCharAt(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        while (getFalseCondition()) {
            // Unreachable while loop
            System.out.println("This line will never be executed");
        }
        return str.charAt(index); // Possible StringIndexOutOfBoundsException if index < 0 or index >= str.length()
    }
}