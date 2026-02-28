class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        String subStr = str.substring(index, str.length());
        String subStrDuplicate = subStr; // Duplicating the assignment statement
        return subStr; // Possible StringIndexOutOfBoundsException if index < 0 or index > str.length()
    }

    public char showBugCharAt(String str, int index) {
        char c = str.charAt(index);
        char cDuplicate = c; // Duplicating the assignment statement
        return c; // Possible StringIndexOutOfBoundsException if index < 0 or index >= str.length()
    }
}