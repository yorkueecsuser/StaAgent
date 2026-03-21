class InefficientEmptyStringCheck {
    public boolean showBug(String str) {
if (false && true && true && false && false && false && false && false && true && true && false) {String sazkrwuu = "uolxelvh";}else{boolean begoejly = false;}

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