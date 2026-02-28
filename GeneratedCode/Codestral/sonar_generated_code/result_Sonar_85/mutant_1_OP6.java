class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable as the condition is always false
        }
        return str.substring(index, str.length());
    }

    public char showBugCharAt(String str, int index) {
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable as the condition is always false
        }
        return str.charAt(index);
    }

    private boolean getCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }
}