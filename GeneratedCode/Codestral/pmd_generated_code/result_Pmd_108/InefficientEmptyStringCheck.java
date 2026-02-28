class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        return checkTrimEmpty(str);  // BUG: InefficientEmptyStringCheck
    }

    // A smarter way to check for an empty string using a do-while loop
    private boolean checkTrimEmpty(String str) {
        int i = 0;
        do {
            if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
            i++;
        } while(i < str.length());
        return true;
    }
}