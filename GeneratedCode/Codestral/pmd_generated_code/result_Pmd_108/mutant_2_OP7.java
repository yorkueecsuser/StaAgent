class InefficientEmptyStringCheck {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(String str) {
        while (getUnreachableCondition()) {
            // This code will never be executed
            System.out.println("This is an unreachable while loop");
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
}