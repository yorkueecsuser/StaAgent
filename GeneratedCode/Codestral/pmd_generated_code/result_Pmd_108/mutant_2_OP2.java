class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        boolean result = str.trim().length() == 0;  // BUG: InefficientEmptyStringCheck
        boolean duplicateResult = str.trim().length() == 0;  // Mutant code: Duplication of the assignment statement
        return result;
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
}