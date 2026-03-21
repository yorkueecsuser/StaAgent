class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
if (false && true && true && false && true && false && true && true && true && true && false) {String pbocdctl = "hoptuuas";}

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