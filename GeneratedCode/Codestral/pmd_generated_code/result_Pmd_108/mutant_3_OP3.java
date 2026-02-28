class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This line should never be executed.");
        }
        return str.trim().length() == 0;  // BUG: InefficientEmptyStringCheck
    }

    private boolean getUnreachableCondition() {
        return false;
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