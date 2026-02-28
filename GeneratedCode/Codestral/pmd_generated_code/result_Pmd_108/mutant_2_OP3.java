class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This is an unreachable if statement");
        }
        return str.trim().length() == 0;  // BUG: InefficientEmptyStringCheck
    }

    // A smarter way to check for an empty string
    private boolean checkTrimEmpty(String str) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This is an unreachable if statement");
        }
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}