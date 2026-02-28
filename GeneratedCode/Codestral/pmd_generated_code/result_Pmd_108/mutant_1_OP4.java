class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable branch");
        } else {
            // Original code
            return str.trim().length() == 0;  // BUG: InefficientEmptyStringCheck
        }
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

    // Method to generate the unreachable condition
    private boolean getCondition() {
        return false;
    }
}