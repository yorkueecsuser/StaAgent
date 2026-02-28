class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
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

    // Mutant code
    private boolean checkTrimEmptyMutant(String s) {
        for(int j = 0; j < s.length(); j++) {
            if(!Character.isWhitespace(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}