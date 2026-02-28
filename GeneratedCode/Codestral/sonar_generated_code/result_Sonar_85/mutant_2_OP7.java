class StringIndexOutOfBoundsBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String showBugSubstring(String str, int index) {
        while (getFalseCondition()) {
            // Unreachable while loop inserted
        }
        return str.substring(index, str.length());
    }

    public char showBugCharAt(String str, int index) {
        if (getFalseCondition()) {
            // Unreachable if statement inserted
        }
        return str.charAt(index);
    }
}