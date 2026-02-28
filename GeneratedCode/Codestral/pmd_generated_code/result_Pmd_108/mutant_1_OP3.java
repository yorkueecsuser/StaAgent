class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        boolean unreachableCondition = (str.length() < 0);  // Unreachable condition
        if (unreachableCondition) {
            throw new RuntimeException("Unreachable code executed!");
        }
        return str.trim().length() == 0;  // Original code
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