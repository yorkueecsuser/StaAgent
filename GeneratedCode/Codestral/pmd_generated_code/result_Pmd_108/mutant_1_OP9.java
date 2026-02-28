class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
        if(str == null)
            return true;
        int i = 0;
        do {
            if(!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
            i++;
        } while(i < str.length());
        return true;
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