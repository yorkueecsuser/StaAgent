class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop
            // This loop will never be executed because the condition is always false
        }
        return str.substring(index, str.length());
    }

    public char showBugCharAt(String str, int index) {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop
            // This loop will never be executed because the condition is always false
        }
        return str.charAt(index);
    }
}