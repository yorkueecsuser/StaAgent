class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        return str.trim().length() == 0;  // BUG: InefficientEmptyStringCheck
    }

    // A smarter way to check for an empty string
    private boolean checkTrimEmpty(String inputString) {
        for(int i = 0; i < inputString.length(); i++) {
            if(!Character.isWhitespace(inputString.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Mutant code added
    private boolean mutantCheckTrimEmpty(String s) {
        for(int j = 0; j < s.length(); j++) {
            if(!Character.isWhitespace(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}