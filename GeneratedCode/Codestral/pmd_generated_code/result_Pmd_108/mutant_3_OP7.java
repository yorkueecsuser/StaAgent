class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        return str.trim().length() == 0;  // BUG: InefficientEmptyStringCheck
    }

    // A smarter way to check for an empty string
    private boolean checkTrimEmpty(String str) {
        boolean loopCondition = false; // Non-final variable for the loop condition
        while (loopCondition) { // Unreachable while loop
            // This code will never be executed
        }

        for(int i = 0; i < str.length(); i++) {
            if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}