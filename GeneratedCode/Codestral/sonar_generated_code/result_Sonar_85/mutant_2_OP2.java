class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        return str.substring(index, str.length());
    }

    public char showBugCharAt(String str, int index) {
        char c = str.charAt(index);
        // Mutant code: duplicate the assignment statement
        char c2 = str.charAt(index);
        return c;
    }
}