class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        // Inserting an unreachable for loop
        for (int j = 0; getFalseCondition(); j++) {
            // This loop will never be executed
        }
        return str.trim().length() == 0;  // BUG: InefficientEmptyStringCheck
    }

    // A smarter way to check for an empty string
    private boolean checkTrimEmpty(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // This method always returns false to make the for loop unreachable
    private boolean getFalseCondition() {
        return false;
    }
}