class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        int value = -1;
        switch (value) {
            case 1: // unreachable case
                return str.substring(index, str.length());
            default:
                return str.substring(index, str.length());
        }
    }

    public char showBugCharAt(String str, int index) {
        // BUG: Indexes to passed to "String" operations should be within the string's bounds
        int value = -1;
        switch (value) {
            case 1: // unreachable case
                return str.charAt(index);
            default:
                return str.charAt(index);
        }
    }
}