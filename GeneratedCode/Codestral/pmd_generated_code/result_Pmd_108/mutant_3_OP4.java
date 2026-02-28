class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        return str.trim().length() == 0;  // BUG: InefficientEmptyStringCheck
    }

    // A smarter way to check for an empty string with an unreachable if-else statement mutant
    private boolean checkTrimEmpty(String str) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        } else {
            for(int i = 0; i < str.length(); i++) {
                if(!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}